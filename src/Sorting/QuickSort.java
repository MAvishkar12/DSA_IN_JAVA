// select a pivot element
// all small element place to its left side
// all big element to its left side
// it divide and conquer algo
//divide large array into smaller
public static int pivotIndex(int arr[],int low,int high){
    int pivot=arr[low];
    System.out.println("Low"+low);
    int i=low+1;
    System.out.println("i"+i);
    int j=high;
    System.out.println("j"+j);
    while (true){
        while (i<=j && arr[i]<=pivot ){
            i++;
        }
        while (i<=j  && arr[j]>pivot) {
          j--;
        }
        System.out.println("arr of i"+i);
        System.out.println("arr of j"+j);
        if(i>=j){
            break;
        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    int temp=arr[j];
    arr[j]=arr[low];
    arr[low]=temp;

    return  j;
}

public static void QuickSort (int arr [],int low,int high) {
      if(low<high){
          int pivotIndex=pivotIndex(arr,low,high);
          System.out.println("Pivot :"+pivotIndex);
          QuickSort(arr,low,pivotIndex-1);
          QuickSort(arr,pivotIndex+1,high);

      }
}

public void main() {
    System.out.println("Quick sort array");
    int arr[]={7,4,1,5,3};
    int n=arr.length-1;
    QuickSort(arr,0,n);
    for(int a:arr){
        System.out.print(a+" ");
    }
}
