package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
//        combSum(arr,"",0,8);
        ArrayList<String> answer = combSumList(arr,"",8);
        List<List<Integer>> listAnswer = combSumListNoDuplicate(arr,"", 8);
        System.out.println(answer);
        
        System.out.println(listAnswer);

    }

    static void combSum(int[] arr,String val, int p,int target){
        if(target==0){
            System.out.println(val);
            return;
        }
        if(target<arr[0]){
            return;
        }

        int i =0;

        while(i<arr.length && arr[i]<=target){
            combSum(arr,val+arr[i],p+arr[i],target-arr[i]);
            i++;
        }
    }

    static ArrayList<String> combSumList(int[] arr,String val, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(val);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int i =0;
        while(i<arr.length && arr[i]<=target){
            if(target-arr[i]>=arr[i] || target==arr[i]){
                ans.addAll(combSumList(arr,val+arr[i],target-arr[i]));
            }
            i++;
        }

        return ans;
    }

    static List<List<Integer>> combSumListNoDuplicate(int[] arr,String p, int target){
        if(target==0){
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> child = new ArrayList<>();
            for(int i=0;i<p.length();i++){
                child.add(p.charAt(i)-'0');
            }
            Collections.sort(child);
            list.add(child);
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();

        int i =0;
        while(i<arr.length && arr[i]<=target){
            if(target-arr[i]>=arr[i] || target==arr[i]) {
                ans.addAll(combSumListNoDuplicate(arr,p+arr[i], target - arr[i]));
            }
            i++;
        }

        return ans;
    }
}
