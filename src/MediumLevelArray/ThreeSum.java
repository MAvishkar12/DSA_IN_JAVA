

//public   static  List<List<Integer>>  ThreeSum (int arr[]) {
//   Set<List<Integer>> l1=new HashSet<>();
//
//    for(int i=0;i<arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//            for(int k=j+1;k< arr.length;k++){
//                if(arr[i]+arr[j]+arr[k]==0){
//                  List<Integer> l2=Arrays.asList(arr[i],arr[j],arr[k]);
//                  Collections.sort(l2);
//                  l1.add(l2);
//                }
//            }
//        }
//    }
//    return  new ArrayList<>(l1);
//
//}

import java.sql.Array;

public static List<List<Integer>> ThreeSum(int arr[]){
    List<List<Integer>> result=new ArrayList<>();
    Arrays.sort(arr); // sort the array
    for(int i=0;i<arr.length-2;i++){
        if(arr[i]>0) break;// first element should be less then zero ie.negative
        if(i>0 && arr[i]==arr[i-1]) continue;; // no similar elements to add

        int left=i+1;
        int right= arr.length-1;
        int sum;
        while (left<right){
            sum=arr[i]+arr[left]+arr[right];
            if(sum==0){

               result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                left++;
                right--;
                while (left<right && arr[left]==arr[left-1]) left++;
               while (left<right && arr[right]==arr[right+1]) right--;

            }
            else if(sum<0){
                left++;
            }
            else {
                right --;
            }
        }


    }
    return result;
}


 void main() {
    int arr[]={2, -1, -1, 3, -1};
     System.out.println(ThreeSum(arr));


}