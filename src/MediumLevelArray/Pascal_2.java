

public static int  Pascal_2 (int n,int m) {
    int r=n-1;
    int c=m-1;
    int result=1;
    for(int i=0;i<c;i++){
        result=result*(r-i);
        result=result/(i+1);
    }
   return result;
}

 void main() {
    int n=5;
    int m=3;
    int result=Pascal_2(n,m);
     System.out.println(result);
}
