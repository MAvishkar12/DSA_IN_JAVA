public static void Selection(int[] arr){
//find a minium element from unsorted array and place it its right position.
   for(int i=0;i<arr.length;i++) {
       int minIndex=i;
       for (int j = i+1; j < arr.length ; j++) {
           if (arr[j] < arr[minIndex]) {
               minIndex = j;
           }
       }

       int temp = arr[minIndex];
       arr[minIndex] = arr[i];
       arr[i] = temp;
   }
}



void main() {
    System.out.println("Selection Sort");
    int arr[]={1,5,2,8,4,9};
    Selection(arr);
    for(int i:arr){
        System.out.print(i+" ");
    }
}
