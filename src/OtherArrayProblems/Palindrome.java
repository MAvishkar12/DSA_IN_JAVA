

public static boolean Palindrome (String str) {
     if(str==null) return  false;


     for(int i=0;i<str.length()/2;i++){
         if(str.charAt(i)!=str.charAt(str.length()-1-i)){
          return false;
         }
     }
     return  true;
}

void main() {
    String str ="level";
    boolean result=Palindrome(str);
    System.out.println(result);
}
