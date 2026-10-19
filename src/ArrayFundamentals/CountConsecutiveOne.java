

public static int CountConsecutiveOne(int arr[]){
     int count=0;
     int maxCount=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]==1){
             count++;
         }

         else {
             count=0;
         }
         maxCount=Math.max(maxCount,count);
     }

    return maxCount;
}

static void main() {
    int arr[]={1, 1, 0, 0, 1, 1, 1, 0};
    int result= CountConsecutiveOne(arr);
    System.out.println(result);
}
