

public static int[] IntersectionSortedArray(int nums1[] ,int nums2[]){
   int temp[]=new int[Math.min(nums1.length,nums2.length)];
   int i=0;
   int j=0;
   int k=0;
   while (i<nums1.length && j< nums2.length){
       if(nums1[i]==nums2[j]){
           temp[k]=nums1[i]; // matching pair compare the increase the index
           k++;
           i++;
           j++;
       }
       else if( nums1[i]<nums2[j]){
           i++;
       }
       else {
           j++;
       }
   }

   int result[]=new int[k];
   for(int a=0;a<k;a++){
       result [a]=temp[a];
   }

   return  result;


}

void main() {
    int nums1[]={1, 2, 2, 3, 3, 3};
    int nums2[]={2, 3, 3, 4, 5, 7};
    int result []=IntersectionSortedArray(nums1,nums2);
    System.out.println(Arrays.toString(result));

}