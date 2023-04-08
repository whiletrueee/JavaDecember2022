package backtracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(nqueens(board,0));
    }

    static int nqueens(boolean[][] board,int r){
        if(r== board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //  a loop to place queen in all the cells
        for (int col = 0; col < board.length; col++) {
            if(safe(board,r,col)){
                board[r][col] = true;
                count +=nqueens(board,r+1);
                board[r][col] = false;
            }
        }
        return count;
    }

    private static boolean safe(boolean[][] board, int r, int col) {

        // no any queen above the placed one
        for(int i=r;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }

        // check left diagonal
        int maxleft = Math.min(r,col);
        for (int i = 1; i <= maxleft; i++) {
            if(board[r-1][col-1]){
                return false;
            }
        }

        // check right diagonal
        int maxRight = Math.min(r,board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[r-1][col+1]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr: board){
            for(boolean b : arr) {
                if (b) {
                    System.out.print('Q');
                } else {
                    System.out.print('X');
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
