package december2022;

public class NumberOfVowels {
    public static void main(String[] args) {
        String s = "textbook";
        char[] ss = s.toCharArray();
        int k = ss.length/2;
        int countA=0;
        int countB=0;
        for(int i=0;i<ss.length/2;i++){
            if(ss[i]=='a' || ss[i]=='A' || ss[i]=='e'|| ss[i]=='E' || ss[i]=='i' || ss[i]=='I' || ss[i]=='o' || ss[i]=='O' || ss[i]=='u' || ss[i]=='U'){
                countA++;
            }
            if(ss[k]=='a' || ss[k]=='A' || ss[k]=='e'|| ss[k]=='E' || ss[k]=='i' || ss[k]=='I' || ss[k]=='o' || ss[k]=='O' || ss[k]=='u' || ss[k]=='U'){
                countB++;
            }
            k++;
        }
        System.out.println(countA);
        System.out.println(countB);
    }
}
