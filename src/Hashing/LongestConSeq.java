
//public static int LongestConSeq(int arr[]) {
//
//    int maxCount=0;
//
//    for(int i=0;i< arr.length;i++){
//        int first=arr[i];
//        int count=1;
//        boolean found=true;
//        while (found){
//            found=false;
//            for(int j=0;j< arr.length;j++){
//                if(arr[j]==first+1){
//                    first=arr[j];
//                    count++;
//                    found=true;
//                    break;
//                }
//            }
//
//            maxCount=Math.max(count,maxCount);
//        }
//    }
//    return maxCount;
//}

public static int LongestConSeq(int arr[]){
    int maxCount=0;
    HashSet<Integer> h1=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        h1.add(arr[i]);

    }

    for(int a:h1){
        if(!h1.contains(a-1)){
            int curr=a;
            int count=1;
            while (h1.contains(curr+1)){
                count++;
                curr++;
            }
            maxCount=Math.max(count,maxCount);
        }
    }
    return  maxCount;
}

 void main() {
     int arr[]={0,3,7,2,5,8,4,6,0,1};
     int result=LongestConSeq(arr);
     System.out.println(result);
}

