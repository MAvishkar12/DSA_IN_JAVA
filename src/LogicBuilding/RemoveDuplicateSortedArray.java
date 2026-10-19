

public static int  RemoveDuplicateSortedArray(int arr[]){

    int k=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]!=arr[k]){
           k++;
           arr[k]=arr[i];
       }
    }
    return k+1;

}

static void main() {
    int arr[]={0, 0, 3, 3, 5, 6}; // -2,2,4,5

 int result=  RemoveDuplicateSortedArray(arr);

    for(int i=0;i< result;i++){
        System.out.println(arr[i]);
    }
}