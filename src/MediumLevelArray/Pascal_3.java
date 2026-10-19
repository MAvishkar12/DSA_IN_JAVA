

public static List<List<Integer>> Pascal_3(int a) {
    int n=a;
    List<List<Integer>> l1=new ArrayList<>();
      for(int i=0;i<n;i++){
          List<Integer> l2=new ArrayList<>();

          l2.add(1);

          int result=1;

          for(int j=0;j<i;j++){

              result=result*(i-j);
              result=result/(j+1);
              l2.add(result);
          }

          l1.add(l2);
      }

      return  l1;

}

void main() {
    int a=5;
    List<List<Integer>> result=Pascal_3(a);
    System.out.println(result);
}
