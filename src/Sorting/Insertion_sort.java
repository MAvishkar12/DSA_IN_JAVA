// Placing the element its right position by comparing it with its side element and do this process until it reach to its desire location.
public static void Insertion_sort (int arr[]) {
    for(int i=0;i<arr.length-1;i++){
        int j=i;//1
        while (j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
    }
}

void main(){
    System.out.println("Insertion Sort");
    int arr[]={5,4,1,2,8};
    Insertion_sort(arr);
    for(int i:arr){
        System.out.print(i+" ");
    }
}