

//public static int [] UnionSortedArray(int arr1[],int arr2[]) {
//    Set <Integer> s1=new LinkedHashSet<>();
//    int i=0;
//    int j=0;
//    while (i<arr1.length && j<arr2.length){
//        if(arr1[i]<=arr2[j]){
//            s1.add(arr1[i]);
//            i++;
//
//        }
//        else {
//            s1.add(arr2[j]);
//
//            j++;
//        }
//
//    }
//    while (i < arr1.length) s1.add(arr1[i++]);
//    while (j < arr2.length) s1.add(arr2[j++]);
//
//    int result []=new int[s1.size()];
//    int index=0;
//    for(int value:s1){
//        result[index]=value;
//        index++;
//
//
//    }
//    return  result;
//}
public static int[] UnionSortedArray(int arr1[],int arr2[]){
    int temp[]=new int[arr1.length+arr2.length];
    int i=0;
    int j=0;
    int k=0;
    while (i<arr1.length && j<arr2.length){
        int val;
        if(arr1[i]<=arr2[j]){
            val=arr1[i];
            i++;

        }
        else {
            val = arr2[j];
            j++;

        }


        if(k==0 || temp[k-1]!=val){
             temp[k]=val;
             k++;
        }
    }

    while (i<arr1.length){
        if(k==0 || temp[k-1]!=arr1[i]){
            temp[k]=arr1[i];
            k++;

        }
        i++;
    }

    while (j<arr2.length){
        if(k==0 || temp[k-1]!=arr2[i]){
            temp[k]=arr2[i];
            k++;
        }
        j++;
    }

    int result[]=new int[k];

    for(int a=0;a<k;a++){
         result [a]=temp[a];

    }
 return result;
}

static void main() {
    int  nums1 []= {10,20,30};
    int nums2 [] = {5,17};
    int result[]=UnionSortedArray(nums1,nums2);
    System.out.print(Arrays.toString(result));

}