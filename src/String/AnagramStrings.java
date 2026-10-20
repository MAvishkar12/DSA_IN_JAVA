

//public static boolean AnagramStrings (String s1,String s2) {
//    if(s1.length()!=s2.length()) return  false;
//    char a[]=s1.toCharArray();
//    char b[]=s2.toCharArray();
//
//     Arrays.sort(a);
//     Arrays.sort(b);
//
//     return  Arrays.equals(a,b);
//}

public static  boolean AnagramStrings(String s1,String s2){
    if(s1.length()!=s2.length()) return  false;
    char  arr []=new char[26];
    for(int i=0;i<s1.length();i++){
        arr[s1.charAt(i)-'a']++;
        arr[s2.charAt(i)-'a']--;
    }

    for(int i:arr){
        if(i!=0){
            return  false;
        }
    }
    return true;
}

 void main() {
 String s1="anagram";
 String s2="nagaram";
  boolean result=AnagramStrings(s1,s2);
     System.out.println(result);
}
