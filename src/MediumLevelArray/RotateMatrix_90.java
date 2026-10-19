

public static void  RotateMatrix_90(int arr[][]) {
    int n= arr.length;
    for(int i=0;i< arr.length;i++){
        for(int j=i+1;j<arr[0].length;j++){
          int temp=arr[i][j];
          arr[i][j]=arr[j][i];
          arr[j][i]=temp;

        }
    }

    for(int i=0;i< n;i++){
        for(int j=0;j<n/2;j++){
            int temp=arr[i][n-1-j];
            arr[i][n-1-j]=arr[i][j];
             arr[i][j]=temp;
        }
    }
}

 void main() {
    int arr[] [] ={{1,2,3},{4,5,6},{7,8,9}};
     RotateMatrix_90(arr);
     for(int i=0;i< arr.length;i++){
         for(int j=0;j< arr[i].length;j++){
             System.out.print(arr[i][j]+" ");
         }
         System.out.print("\n");
     }
}