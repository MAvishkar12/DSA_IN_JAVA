
// Brute force
//public static int  MajorityElement_1 (int arr[]){
//    HashMap<Integer,Integer> h1 = new HashMap<>();
//    for(int i=0;i< arr.length;i++){
//        h1.put(arr[i], h1.getOrDefault(arr[i],0)+1);
//    }
//    for(Map.Entry<Integer,Integer> result: h1.entrySet()){
//        if(result.getValue()> arr.length/2){
//            return result.getKey();
//        }
//
//    }
//    return 0;
//}
// optimal approach

//Moores Voting algo

public static int MajorityElement_1(int arr[]){

    int count=0;
    int ele=0;
    for(int i=0;i< arr.length;i++){
        if(count==0){
            ele=arr[i];
            count++;
        } else if (arr[i]==ele) {
            count++;
        }
        else  {
            count --;
        }
    }
    int freCount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==ele) freCount++;
    }
    if(freCount > arr.length/2){
        return  ele;
    }
    return  -1;
}



 void main() {
    int arr[]={1, 1, 1, 2, 1, 2};
   int result= MajorityElement_1(arr);
     System.out.println(result);
}
