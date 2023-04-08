package recursion;

public class Batsman {
    public static void main(String[] args) {
        possibleHit("",10);
    }

    static void possibleHit(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        if(target<2){
            return;
        }

        possibleHit(p+"2",target-2);

        if(target<4){
            return;
        }

        possibleHit(p+"4",target-4);

        if(target<6){
            return;
        }

        possibleHit(p+"6",target-6);
    }
}
