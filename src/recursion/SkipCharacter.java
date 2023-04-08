package recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "baccada";
        StringBuilder builder = new StringBuilder();
        skipChar(s,'a',0,builder);
        System.out.println(builder);

    }
    static void skipChar(String s, char a,int index,StringBuilder builder ){
        if(index==s.length()){
            return;
        }
        if(s.charAt(index)==a){
            skipChar(s,a,index+1,builder);
        }else {
            builder.append(s.charAt(index));
            skipChar(s,a,index+1,builder);
        }
    }

}
