

//public static int Longest_Subarray_Sum(int arr[],int k) {
//
//   int maxlength=0;
//   for(int i=0;i<arr.length;i++){
//        int sum=0;
//        for(int j=i;j<arr.length;j++){
//            sum+=arr[j];
//            if(sum==k){
//                maxlength=Math.max(maxlength,j-i+1);
//            }
//        }
//    }
//   return  maxlength;
//
//}

// Using Hashmap
public static int Longest_Subarray_Sum(int arr[],int k){
    int sum=0;int maxLength=0;
    HashMap<Integer,Integer> h1=new HashMap<>();

    for(int i=0;i< arr.length;i++){
        sum+=arr[i];
        if(sum==k){
            maxLength=i+1;
        }
        if(h1.containsKey(sum-k)){
            maxLength=Math.max(maxLength,i-h1.get(sum-k));
        }
        h1.putIfAbsent(sum,i);
        System.out.println(h1);

    }
    return  maxLength;

}


//  Using Two pointer
//public static int Longest_Subarray_Sum(int arr[],int k){
//    int right=0;
//    int left=0;
//    int sum=0;
//    int maxlength=0;
//    int n=arr.length;
//    while (right<n){
//        sum+=arr[right];
//        if(sum>k && left<=right){
//            sum-=arr[left];
//            left++;
//
//        }
//        if(sum==k){
//            maxlength=Math.max(maxlength,right-left+1);
//        }
//        right++;
//
//    }
//    return maxlength;
//}

static void main() {
    int arr[]={10, 5, 2, 7, 1, 9};
    int target=15;
   int result= Longest_Subarray_Sum(arr,target);
    System.out.println(result);
}
