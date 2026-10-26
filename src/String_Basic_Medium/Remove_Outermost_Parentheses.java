

public static String Remove_Outermost_Parentheses (String s) {
    StringBuilder sc=new StringBuilder();
    int down=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

        if(c=='('){
            if(down>0){
                sc.append('(');

            }
            down++;

        }
        else{
            down --;
            if(down>0){
                sc.append(')');
            }
        }
    }
    return sc.toString();
}

static void main() {
    String s="((()))";
    String result=Remove_Outermost_Parentheses(s);
    System.out.println(result);

}