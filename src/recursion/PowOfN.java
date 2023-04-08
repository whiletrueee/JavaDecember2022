package recursion;

public class PowOfN {
    public static void main(String[] args) {
        double x = 8.84372;
        int n = -5;
        if(n<0){
            x=1/x;
            n=-n;
            System.out.println( doublee(x,n,x));
        }else{
            System.out.println(doublee(x,n,x));
        }
    }

    static double doublee(double x,int n,double ans){
        if(n==0){
            return 1;
        }
        if(n==1){
            return ans;
        }
        return doublee(x,n-1,ans*x);
    }
}
