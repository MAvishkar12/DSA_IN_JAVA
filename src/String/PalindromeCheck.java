

public static boolean PalindromeCheck (String s) {
    int n=s.length();
   for(int i=0;i<n/2;i++){
       if(s.charAt(i)!=s.charAt(n-1-i)){
           return  false; // always check negative test case in comparison.
       }
   }
 return  true;
}

static void main() {
 String s= s = "hannah";
 boolean result=PalindromeCheck(s);
    System.out.println(result);

}
