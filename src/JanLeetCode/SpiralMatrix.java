package JanLeetCode;

import java.sql.Array;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int oe = arr.length-1;
        int ie = arr[0].length-1;
        int os = 1;
        int is = 0;

        int[] finalList = new int[(oe+1)*(ie+1)];

        for (int i = 0; i < (oe+1)*(ie+1); i++) {
            if(i<=ie) {
                finalList[i] = arr[is][i];
            }
            int k =1;
            if(k<=oe){
                finalList[i] = arr[k][oe];
            }
            k++;
        }

        System.out.println(Arrays.toString(finalList));
    }
}
