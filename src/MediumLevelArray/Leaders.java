// Brute force

//public static void Leaders (int arr[]){
//    for(int i=0;i<arr.length;i++){
//        boolean leader=true;
//                for(int j=i+1;j< arr.length;j++){
//                    if(arr[j]>arr[i]){
//                        leader=false;
//                        break;
//                    }
//                }
//                if(leader==true){
//                    System.out.print(arr[i]);
//                }
//    }
//}

import java.sql.Array;//optimal
public static int[] Leaders(int arr[]){
    ArrayList<Integer> a1=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]>max){
            max=arr[i];
            a1.add(arr[i]);
        }
    }
    int result[]= new int[a1.size()];
    for(int i=0;i< a1.size();i++){
        result[i]=a1.get(i);
    }
    return result;
}
 void main() {
  int arr[]={1, 2, 5, 3, 1, 2};
 int arr1[]= Leaders(arr);
     System.out.println(Arrays.toString(arr1));
}
