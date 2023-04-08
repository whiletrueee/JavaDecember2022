package recursion;

import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {
        String s = "10#11#123";
        System.out.println(Arrays.toString(s.split("#")));
        int n = (s.charAt(0) - '0') * 10 + s.charAt(1)-'0'+96;
        char c = (char)n;
        System.out.println(c);
        s+=c;
        System.out.println(s);
    }
}
