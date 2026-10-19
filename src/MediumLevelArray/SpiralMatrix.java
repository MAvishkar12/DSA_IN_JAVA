

public static List<Integer> SpiralMatrix (int matrix[][]) {
    ArrayList<Integer> a1=new ArrayList<>();

    int top=0;
    int left=0;
    int right=matrix[0].length-1; // columns
    int bottom=matrix.length-1; // rows
    while (left<=right && top<=bottom){

        for(int i=left;i<=right;i++){
            a1.add(matrix[top][i]);
        }
        top++;

        for(int i=top;i<=bottom;i++){
            a1.add(matrix[i][right]);
        }
        right --;

        if(top<=bottom){ // avoid  printing single row reverse
            for(int i=right;i>=left;i--){
                a1.add(matrix[bottom][i]);
            }
            bottom --;
        }

        if(left<=right){ // avoid printing single column reverse
            for(int i=bottom;i>=top;i--){
                a1.add(matrix[i][left]);

            }
            left++;
        }

    }

    return a1;

}

static void main() {
    int[][] matrix = {
            {1, 2, 3, 4}, {5, 6, 7, 8}
    };
   List<Integer> a1=SpiralMatrix(matrix);
    System.out.println(a1);
}