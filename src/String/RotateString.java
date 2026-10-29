

//public static boolean RotateString(String s,String g)  {
//    if (s.length() != g.length()) return false;
//    if (s.equals(g)) return true;
//    StringBuilder sc=new StringBuilder(s);
//    for(int i=0;i<s.length();i++){
//        char temp=sc.charAt(0);
//        sc.deleteCharAt(0);
//        sc.append(temp);
//        String s2=sc.toString();
//        if(s2.equals(g)){
//            return true;
//        }
//
//
//
//    }
// return  false;
//}
// Check rotate string present in the original string.
public static boolean RotateString(String s,String g){
    if(s.length()!=g.length()) return false;
    return  (s+s).contains(g);
}

 void main() {
 String s="abcde";
 String goal="cdeab";
  boolean result=RotateString(s,goal);
     System.out.println(result);
}
