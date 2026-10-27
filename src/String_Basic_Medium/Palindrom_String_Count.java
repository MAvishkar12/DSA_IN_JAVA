//
//public static boolean isPalindrome(String s,int left,int right){
//    while (left<right){
//        if(s.charAt(left)!=s.charAt(right)){
//            return  false;
//        }
//        left++;
//        right--;
//    }
//    return true;
//
//}
//
//public static int Palindrom_String_Count(String s) {
//    int count=0;
//    for(int i=0;i<s.length();i++){
//        for(int j=i;j<s.length();j++){
//            if(isPalindrome(s,i,j)){
//                count++;
//            }
//        }
//    }
//    return  count;
//}

public static int Palindrom_String_Count(String s){
    int count=0;
    for(int i=0;i<s.length();i++){
         count+=count_SubString_Palindrome(s,i,i); // odd length palindrome
        count+=count_SubString_Palindrome(s,i,i+1); //even length palindrome
    }
    return  count;

}

public static int count_SubString_Palindrome(String s,int left,int right){
    int count=0;
    while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
        count++;
        left--;
        right++;
    }
    return  count;


}
public static void main() {
    String s="abc";
    int result=Palindrom_String_Count(s);
    System.out.println(result);
}
