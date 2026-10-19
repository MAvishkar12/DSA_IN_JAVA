public static int LargestElementinArray (int arr[]){
    int large=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>large){
            large=arr[i];
        }
    }
    return  large;
}

 void main() {
    int arr[]={3, 3, 6, 1};
 int result=LargestElementinArray(arr);
    System.out.println(result);
}