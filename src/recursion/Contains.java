package recursion;

public class Contains {
    public static void main(String[] args) {
        int count=0;
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";

        for(String k :patterns){
            if(word.contains(k)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
