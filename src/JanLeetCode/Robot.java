package JanLeetCode;

public class Robot {
    public static void main(String[] args) {
        String moves = "LL";
        int u = 0,d=0,r=0,l=0;

        boolean result=true;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                System.out.println("U");
                u+=1;
                System.out.println("U "+u);
            }else if(moves.charAt(i)=='D'){
                d+=1;
                System.out.println("D "+d);
            }else if(moves.charAt(i)=='R'){
                r+=1;
                System.out.println("R "+r);
            }else{
                l+=1;
                System.out.println("L "+l);
            }
        }
        if(u==d && r==l){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
