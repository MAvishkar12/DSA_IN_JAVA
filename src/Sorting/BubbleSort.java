
// compare adjacent element and place it to its right position
// here array sort from backside


    public static void  BubbleSort ( int [] arr) {
        for(int i=0;i<arr.length-1;i++ ){
            for(int j=0;j<arr.length-1-i;j++){ // no need to compare last element
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }


void main(String[] args) {
    System.out.println("Hello");
    int arr[]={5,4,1,2,8};
   BubbleSort(arr);
    for(int i:arr){
        System.out.print(i+" ");
    }
}


