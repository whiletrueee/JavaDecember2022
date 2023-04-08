package matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] box = {
                {21,22,23,24,25},
                {16,17,18,19,20},
                {11,12,13,14,15}
        };

        int[][] transposeBox = transpose(box);
        System.out.println("Transpose of Matrix ->");
        display(transposeBox);

        int[][] rotate90Box = rotate90(box);
        System.out.println("Rotation of 90degree ->");
        display(rotate90Box);

        int[] spiral = spiralMatrix(box);
        System.out.println("Printing Spiral of Matrix ->");
        System.out.println(Arrays.toString(spiral));

    }

    private static int[][] rotate90(int[][] box) {
        int[][] newBox = transpose(box);

        for (int i = 0; i < newBox.length/2; i++) {
            int[] temp = newBox[i];
            newBox[i] = newBox[newBox.length-i-1] ;
            newBox[newBox.length-i-1] = temp;
        }
        return(newBox);
    }

    private static void display(int[][] box){
        for (int[]a : box) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static int[][] transpose(int[][] box){
        int[][] newBox = new int[5][3];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                newBox[j][i] = box[i][j];
            }
        }
        return(newBox);
    }

    private static int[] spiralMatrix(int[][] box){
        int top=0, left=0, bottom= box.length-1, right=box[0].length-1;
        int lengthh = (box.length) * (box[0].length);
        int[] arr = new int [lengthh];

        int k = 0;
        while(top<=bottom && left<=right){
            for (int i = left; i <= right ; i++) {
                arr[k] = box[top][i];
                k++;
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                arr[k]=box[i][right];
                k++;
            }
            right--;

            if(top<=bottom){
            for (int i = right; i >= left; i--) {
                arr[k] = box[bottom][i];
                k++;
            }
            bottom--;

            if(left<=right){
                for (int i = bottom; i >=top ; i--) {
                    arr[k] = box[i][left];
                }
            }
        }

        }
        return arr;
    }
}
