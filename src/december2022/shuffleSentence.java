package december2022;

import java.util.Arrays;

public class shuffleSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = s.split(" ");

        String[] arr2 = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            int ind = Character.getNumericValue(arr[i].charAt(arr[i].length()-1))-1;
            arr2[ind] = arr[i].substring(0,arr[i].length()-1);
        }

        StringBuilder builder = new StringBuilder();
        for (String i: arr2){
            builder.append(i);
            builder.append(" ");
        }

        System.out.println(builder.toString().strip());
    }
}
