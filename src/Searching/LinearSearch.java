public static int  LinearSearch (int arr[],int target) {
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return  i;
        }
    }

    return  -1;
}

public void main() {
    int arr []={10, 23, 45, 70, 11, 15};
    int target=70;
    int result=LinearSearch(arr,target);
    System.out.println("Result is "+result);
}