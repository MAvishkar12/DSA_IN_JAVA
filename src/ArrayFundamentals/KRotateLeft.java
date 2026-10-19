
public static void reverserarray(int arr[],int left,int right){
    while (left<right){
        int temp=arr[left];//1
        arr[left]=arr[right];
        arr[right]=temp;

        left++;
        right--;
    }

}
public static void KRotateLeft (int arr[],int k){
    int n= arr.length;
    k=k % n;

    reverserarray(arr,0,k-1); // first half reverse
    reverserarray(arr,k,n-1); // second half reverse
    reverserarray(arr,0,n-1); // whole array reverse


}

 void main() {
    int arr[]={1,2,3,4,5,6,7};
    int k=2;
     KRotateLeft(arr,k);
     for(int a:arr){
         System.out.print(a);
     }

}
