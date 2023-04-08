package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
//        subseq(" ","abc");
        System.out.println(subseqRet("","abc"));
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        subseq(p+c,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<String>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);

        ArrayList<String> left = subseqRet(p+c,up.substring(1));
        ArrayList<String> right = subseqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }

}
