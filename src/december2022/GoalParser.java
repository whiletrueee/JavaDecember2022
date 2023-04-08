package december2022;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<command.length();i++){
            char ch = command.charAt(i);
            if(ch=='G'){
                builder.append('G');
            }else if(ch=='(' && command.charAt(i+1)==')'){
                builder.append('o');
                i++;
            }else if(ch=='(' && command.charAt(i+1)=='a'){
                builder.append("al");
            }
        }
        System.out.println(builder);
    }
}
