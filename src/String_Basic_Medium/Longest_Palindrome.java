
public static int expand(String s,int left,int right){
    while (left>=0 && right<=0 && s.charAt(left)==s.charAt(right)){
        left--;
        right++;
    };
    return  right-left+1;
}

public static String Longest_Palindrome (String s) {
    int maxLength=1;
    int start=0;
    int length;
    for(int i=0;i<s.length();i++){
        int length1=expand( s, i, i);// Odd palindrome length
        int length2=expand(s,i,i+1); // Even palindrome length
         length=Math.max(length1,length2);
        if(length>maxLength){
            maxLength=length;
            start=i-(length-1)/2;
        }


    }
    return  s.substring(start,start+maxLength);


}

static void main() {
    String sc="EBBABAD";
    String result=Longest_Palindrome(sc);

}
