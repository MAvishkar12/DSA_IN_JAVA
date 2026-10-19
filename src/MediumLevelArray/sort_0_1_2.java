

//public static void Sort_0_1_2(int arr[]) {
//    for(int i=0;i< arr.length;i++){
//      int  min=i;
//        for(int j=i+1;j< arr.length;j++){
//            if(arr[j]<arr[min]){
//                min=j;
//            }
//        }
//        int temp=arr[i];
//        arr[i]=arr[min];
//        arr[min]=temp;
//    }
//}

// Optimal
//If arr[mid] == 0 : Swap arr[low] and arr[mid], then increment both low and mid. mid++;low++;
//If arr[mid]==1 ,mid++
// If arr[mid]=2 ,Swap arr[high] and arr[mid], then increment both low and mid. high --;

public static void Sort_0_1_2(int arr[]){
    int low=0;
    int mid=0;
    int high= arr.length-1;
    while (mid<=high){
        if(arr[mid]==0){
            int temp=arr[mid];
            arr[mid]=arr[low];
            arr[low]=temp;
            mid++;
            low++;

        }
        else if(arr[mid]==1){
            mid++;
        }
        else {
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }
    }
}

 void main() {
    int arr[]={1, 0, 2, 1, 0};
    Sort_0_1_2(arr);
    for(int a:arr){
        System.out.print(a+" ");
    }
}
