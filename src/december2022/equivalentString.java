package december2022;

public class equivalentString {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for(String i : word1){
            builder1.append(i);
        }
        for(String i : word2){
            builder2.append(i);
        }
        System.out.println(builder1);
        System.out.println(builder2);

        if(builder1.toString().equals(builder2.toString())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        String ces = "KHarshit";
        System.out.println(ces);

    }
}
