package backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] paths = new int[maze.length][maze[0].length];

        allPossiblePaths("",maze,1,0,0);
        allPossiblePathsPrint("",maze,1,0,0,paths);

    }

    static void allPossiblePaths(String p,boolean[][] maze,int steps,int r,int c){
        if(r==maze.length-1 && c== maze.length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
            allPossiblePaths(p+"D",maze,steps+1,r+1,c);
        }

        if(c<maze[0].length-1){
            allPossiblePaths(p+"R",maze,steps+1,r,c+1);
        }

        if(r>0){
            allPossiblePaths(p+"U",maze,steps+1,r-1,c);
        }

        if(c>0){
            allPossiblePaths(p+"L",maze,steps+1,r,c-1);
        }

        maze[r][c]=true;

    }

    static void allPossiblePathsPrint(String p,boolean[][] maze,int steps,int r,int c,int[][] paths){
        if(r==maze.length-1 && c== maze.length-1){
            paths[r][c] = steps;
            for(int[] arr: paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println(" ");
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        paths[r][c] = steps;

        if(r<maze.length-1){
            allPossiblePathsPrint(p+"D",maze,steps+1,r+1,c,paths);
        }

        if(c<maze[0].length-1){
            allPossiblePathsPrint(p+"R",maze,steps+1,r,c+1,paths);
        }

        if(r>0){
            allPossiblePathsPrint(p+"U",maze,steps+1,r-1,c,paths);
        }

        if(c>0){
            allPossiblePathsPrint(p+"L",maze,steps+1,r,c-1,paths);
        }
        maze[r][c]=true;
        paths[r][c] = 0;
    }
}
