package JanLeetCode;

public class ExcelSheet {
    public static void main(String[] args) {
        int n = 28;
        String s="";
        if(n<27 && n>0){
            System.out.println((char)65+n);
        }else{
            int div = (n/26)+64;
            int rem = (n%26) + 64;
            s+=(char)div;
            s+=(char)rem;
            System.out.println(s);
        }
    }
}
