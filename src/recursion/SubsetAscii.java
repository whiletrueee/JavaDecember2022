package recursion;

import java.util.ArrayList;

public class SubsetAscii {
    public static void main(String[] args) {
        asciisubset("","ab");
    }

    static void asciisubset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        asciisubset(p+c,up.substring(1));
        asciisubset(p+(c+0),up.substring(1));
        asciisubset(p,up.substring(1));

    }
}
