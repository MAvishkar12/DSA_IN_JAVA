
public static void  LeftRotateOne (int arr[]) {
    int firstElement=arr[0];
    for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
    }
    arr[arr.length-1]=firstElement;
}

 void main() {
     int arr[]={1,2,3,4,5};
     LeftRotateOne(arr);
     for(int a:arr){
         System.out.print (a);
     }

}