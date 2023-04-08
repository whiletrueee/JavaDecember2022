package JanLeetCode;

public class MapString {
    public static void main(String[] args) {
        String s = "10#11#12";
        mapp(s);
    }

    static void mapp(String s){
        String alpha = "";
        if(s.charAt(0)=='#'){
            System.out.println("Invalid String");
            return;
        }
        String[] st = s.split("#");
        for(String k :st){
            if(k.length()%2==0){
                for(int i =0 ; i<k.length()-1;i+=2){
                    int n = s.charAt(i)-'0'*10 + s.charAt(i+1) +96;
                    char ch = (char)n;
                    alpha+=ch;
                }
            }
        }
        System.out.println(alpha);
        }
    }
