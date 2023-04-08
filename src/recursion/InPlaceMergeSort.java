package recursion;

import java.util.Arrays;

public class InPlaceMergeSort {

    public static void main(String[] args) {
        int[] arr = {84,42,41,98,23,67,12,10,79};
        mergeSort(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }

        int mid = (e+s)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        merge(arr,s,mid,e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];

        int i=s;
        int k=0;
        int j=m;

        while (i< m && j< e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
