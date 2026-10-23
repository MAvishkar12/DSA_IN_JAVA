

public static int  Count_Subarrays_Sum(int arr[],int k) {
    int count=0;

    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j< arr.length;j++){
            sum+=arr[j];
            if(sum==k){
                count++;
            }

        }
    }
    return  count;

}

 void main() {
    int arr[]={1, 2, 3};
    int k=3;
   int result= Count_Subarrays_Sum(arr,k);
     System.out.println(result);
}