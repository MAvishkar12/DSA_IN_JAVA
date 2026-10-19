
public static void SetMatrics_0 (int matrix [] []) {
    int row[]= new int[matrix.length];
    int col[]=new int[matrix[0].length];
    for(int i=0;i< matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
    }

    for(int i=0;i< matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
               if(row[i]==1 || col[j]==1){
                   matrix[i][j]=0;
               }
        }
    }

}

 void main() {
    int matrix[] []={{1,2,3},{4,0,6},{0,7,6}};
    SetMatrics_0(matrix);
    for(int i=0;i< matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.print("\n");
    }

}