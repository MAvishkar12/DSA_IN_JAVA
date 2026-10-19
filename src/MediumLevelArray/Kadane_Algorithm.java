

//public static int Kadane_Algorithm (int arr[]) {
//
//    int maxSum = Integer.MIN_VALUE;
//    for(int i=0;i< arr.length-1;i++){
//        int sum=0;
//        for(int j=i;j< arr.length-1;j++){
//            sum+=arr[j];
//            maxSum=Math.max(sum,maxSum);
//        }
//
//    }
//    return maxSum;
//}

//public static int Kadane_Algorithm(int arr[]){
//    int sum=arr[0];
//    int maxSum=arr[0];
//    for(int i=1;i< arr.length;i++){
//        sum=Math.max(arr[i],sum+arr[i]);
//        maxSum=Math.max(sum,maxSum);
//    }
//
//    return maxSum;
//}

// stiver solution // sub array solution
public static int Kadane_Algorithm(int arr[]){
    int maxSum=Integer.MIN_VALUE;
    int sum=0;


    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum>maxSum){
            maxSum=sum;

        }

    }

    return maxSum;
}





static void main() {
    int arr[]={-2, -3, -7, -2, -10, -4};
  int result= Kadane_Algorithm(arr);
    System.out.println(result);

}
