
public static int String_Integer (String s){
    int i=0; int n=s.length();
    while (i<n && s.charAt(i)==' '){
        i++;  // move to digit or sign
    }
    if(i==n) return 0; // no number present
    int sign=1;
    while (s.charAt(i)=='+' || s.charAt(i)=='-'){
        sign=s.charAt(i)=='-' ? -1:1;
        i++;
    }
    int result=0;
    while (i<n && Character.isDigit(s.charAt(i))){ // check that string char is number
        int digit=s.charAt(i)-'0'; // divide from ascii character
        result=result*10+digit;
        i++;
    }
    return  result*sign;
}

static void main() {
    String str="words and 987";
   int result= String_Integer(str);
    System.out.println(result);
}
