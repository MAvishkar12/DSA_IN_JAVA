public static int BinarySearch (int arr[],int target) {
    int low=0;
    int high=arr.length-1;
    while (low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return  mid;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else {
            high=mid-1;
        }
    }
    return  -1;
}

void main() {
    int arr[]={1, 3, 5, 7, 9, 11};
    int target=5;
    int result=BinarySearch(arr,target);
    System.out.println(result);
}