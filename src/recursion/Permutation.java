package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(allPermutation("",str));
    }

    static ArrayList<String> allPermutation(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<String>();

        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(allPermutation(f+ch+s,up.substring(1)));
        }

        return ans;
    }
}
