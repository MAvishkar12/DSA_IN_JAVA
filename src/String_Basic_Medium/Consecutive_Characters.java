

//public static char Consecutive_Characters(String s) {
//    int maxCount=0;
//
//    char result=s.charAt(0);
//    for(int i=0;i<s.length();i++){
//        int count=0;
//        for(int j=i;j<s.length();j++){
//            if(s.charAt(i)!=s.charAt(j)){
//                break;
//            }
//            count++;
//        }
//        if(count>maxCount){
//            maxCount=count;
//            result=s.charAt(i);
//        }
//    }
//    return result;
//
//
//}

//public static char Consecutive_Characters(String s){
//    int maxCount=0;
//    int n=s.length();
//    char result=s.charAt(0);
//    for(int i=0;i<s.length();i++){
//        int count=1;
//        while (i+1<n && s.charAt(i)==s.charAt(i+1)){
//            i++;
//            count++;
//        }
//        if(count>maxCount){
//            maxCount=count;
//            result=s.charAt(i);
//        }
//    }
//    return  result;
//
//}

public static char Consecutive_Characters(String s){
    int maxCount=0;
    int n=s.length();
    char result=s.charAt(0);
    int count=1;
    for(int i=1;i<n;i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }
        else{
            count=1;
        }
        if(count>maxCount){
            maxCount=count;
            result=s.charAt(i-1);
        }
    }
    return  result;
}



static void main() {
    String s="aaaabbaaccde";
    char result=Consecutive_Characters(s);
    System.out.println(result);
}
