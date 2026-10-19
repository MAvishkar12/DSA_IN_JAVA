

//public static int[] TwoSum(int arr[],int target) {
// for(int i=0;i<arr.length;i++){
//  for(int j=i+1;j<arr.length;j++){
//    if(arr[i]+arr[j]==target){
//     return  new int [] {i,j};
//    }
//  }
// }
// return  new int[] {};
//
//}

public static int[] TwoSum(int arr[],int target) {
 HashMap<Integer,Integer> h1=new HashMap<>();
 for(int i=0;i<arr.length;i++){
  int complementary=target-arr[i];
  if(h1.containsKey(complementary)){
   return new int[] {h1.get(complementary),i};
  }
  h1.put(arr[i],i);
 }
 return  new int[]{};

}

 void main() {
 int arr[]={1, 6, 2, 10, 3};
 int target=7;
  int result[]=TwoSum(arr,target);
  System.out.print(Arrays.toString(result));
}