package december2022;

import java.util.Arrays;

public class MatricesSearch {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30},
                {15,25,35},
                {28,29,40}
        };
        System.out.println(Arrays.toString(search(arr,35)));
    }

    static int[] search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;

        while(r < matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
