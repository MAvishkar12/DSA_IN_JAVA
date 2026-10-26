
public static int Maximum_Nesting_Depth (String s){
    int count=0;
    int maxCount=0;

    for(char c : s.toCharArray()){
       if(c=='('){
           count++;
       }
       else if(c==')'){
           count--;
       }
       maxCount=Math.max(count,maxCount);

    }
    return  maxCount;

}

public static void main(String[] args) {
    String s="(1)+((2))+(((3)))";
    int result=Maximum_Nesting_Depth(s);
    System.out.println(result);

}
