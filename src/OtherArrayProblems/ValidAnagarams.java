

public static boolean ValidAnagarams (String s1,String s2) {
    if (s1.length() != s2.length()) return false;
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println(arr1);
    System.out.println(arr2);
   return  Arrays.equals(arr1,arr2);
}


 void main() {
    String s1="listen";
    String s2="silent";
    boolean result=ValidAnagarams(s1,s2);
     System.out.println(result);
}