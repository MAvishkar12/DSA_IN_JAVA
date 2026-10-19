

public static int  MissingNumber (int arr[],int n) {
    int sumN=n*(n+1)/2;
    int sum=0;
    for(int i=0;i< arr.length;i++){
        sum+=arr[i];
    }
    return  sumN-sum;
}

 void main() {
    int arr[]={1, 3, 6, 4, 2, 5};
    int n=arr.length;
   int result= MissingNumber(arr,n);
     System.out.println(result);

}