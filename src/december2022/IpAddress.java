package december2022;

import java.util.Arrays;

public class IpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1" ;
        System.out.println(Arrays.toString(address.split("\\.")));
        String[] arr = address.split("\\.");
        String arr2 = address.replace(".","[.]");
        System.out.println(arr2);
        String newstr;
        newstr = arr[0];
        for(String i : arr){
            newstr = newstr + "[.]" + i;
        }
        System.out.println(newstr);
    }
}
