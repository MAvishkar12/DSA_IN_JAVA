

public static void ZeroToEnd (int arr[]) {
     int j=0; // track the zero :  place non zero element to its right position swap it with zero
     for(int i=0;i< arr.length;i++){
         if(arr[i]!=0){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             j++;
         }
     }
}

void main() {
        int arr[]={1, 4  , 0, 0, 5, 2};
      ZeroToEnd(arr);
      for(int a:arr){
          System.out.print(a);
      }

}