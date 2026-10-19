
public static void Merge(int arr [],int low,int mid,int high) {
  ArrayList <Integer> arrayList=new ArrayList<>();
    System.out.println("low value"+low);
  int left=low;
  int right=mid+1;
  while (left<=mid && right<=high){
      if(arr[left]<=arr[right]){
          arrayList.add(arr[left]);
          left++;
      }

      else{
          arrayList.add(arr[right]);
          right++;
      }
  }

   while (left<=mid){
       arrayList.add(arr[left]);
       left++;
   }
   while (right<=high){
       arrayList.add(arr[right]);
       right++;
   }

   for(int i=0;i<arrayList.size();i++){
       arr[low+i]=  arrayList.get(i); //   ??
   }
}

public static void MergeSort(int arr[],int low,int high) {
    if (low >= high) return;
        int mid=(low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);

}

void main() {
    int arr[]={7,8,5,3,2,1,9};
    int n=arr.length-1;
    MergeSort(arr,0,n);
    for(int a:arr){
        System.out.print(a+" ");
    }
}