package december2022;

public class StringShuffle {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String[] arr = new String[indices.length];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]] = String.valueOf(s.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        for(String k :arr){
            builder.append(k);
        }
        System.out.println(builder);
    }
}
