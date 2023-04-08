package recursion;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(poweroftwo(n));
    }

    static boolean poweroftwo(int n){
        if(n==0){
            return false;
        }

        if(n==1){
            return true;
        }

        if(n%2==0){
            return poweroftwo(n/2);
        }else{
            return false;
        }
    }
}
