
public static ArrayList<Integer> Pascal_1 (int row) {
    int n=row-1;
    ArrayList<Integer> a1=new ArrayList<>();
    a1.add(1);
    for(int i=0;i<n;i++){
        int result=1;
        for(int j=0;j<=i;j++){
            result=result*(n-j);
            result=result/(j+1);
        }
        a1.add(result);
    }
    return a1;
}

 void main() {
  int row=4;
  List<Integer> result=Pascal_1(row);
     System.out.println(result);

}