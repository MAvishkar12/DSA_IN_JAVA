
//public static int Largest_Sub_Sum_0 (int arr[]) {
//    int maxlength=0;
//    for(int i=0;i< arr.length;i++){
//        int sum=0;
//        for(int j=i;j<arr.length;j++){
//            sum+=arr[j];
//            if(sum==0){
//                maxlength=Math.max(maxlength,j-i+1);
//            }
//        }
//    }
//    return maxlength;
//}
public static  int Largest_Sub_Sum_0(int arr[]){
    int maxlength=0;
    int sum=0;
    HashMap<Integer,Integer> h1=new HashMap<>();
    for(int i=0;i< arr.length;i++){
        sum+=arr[i];
        if(sum==0){
            maxlength=i+1;
        }
        if(h1.containsKey(sum-0)){
            maxlength=Math.max( maxlength, i-h1.get(sum-0));
        }
        h1.putIfAbsent(sum,i);//{15,0} {13,1} {}
    }
    return  maxlength;
}


static void main() {
    int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
    int result=Largest_Sub_Sum_0(arr);
    System.out.println(result);
}
