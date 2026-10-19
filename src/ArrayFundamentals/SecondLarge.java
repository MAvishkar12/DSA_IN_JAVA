
public static int  SecondLarge (int arr[]) {
    int large=Integer.MIN_VALUE;
    int sLarge=Integer.MAX_VALUE;
    for(int i=0 ;i<arr.length;i++){
        if(arr[i]>large){
            sLarge=large;
            large=arr[i];

        }
        else if(arr[i]!=large && arr[i]>sLarge){
            sLarge=arr[i];
        }

    }
    return (sLarge == Integer.MIN_VALUE) ? -1 : sLarge; //[10,10,10,10,10]
}

 void main() {
    int arr[]={8, 8, 7, 6, 5};
  int result=  SecondLarge(arr);
     System.out.println(result);
}
