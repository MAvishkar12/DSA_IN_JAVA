
//public static void RearrangeNegativePositive (int arr[]) {
//    int positive[]= new int[arr.length];
//    int negative[]=new int[arr.length];
//    int p=0; int n=0;
//    for(int i=0;i< arr.length;i++){
//        if(arr[i]>=0){
//            positive[p]=arr[i];
//            p++;
//        }
//        else {
//            negative[n]=arr[i];
//            n++;
//        }
//    }
//
//    for(int i=0;i< postive.length;i++){
//        arr[2*i]=positive[i];
//    }
//
//    for(int j=0;j< negative.length;j++){
//        arr[2*j+1]=negative[j];
//    }
//
//    for(int a:arr){
//        System.out.println(a);
//    }
//}
public static void RearrangeNegativePositive(int arr[]){
    int p=0;
    int n=1;
    int temp[]=new int[arr.length];
    for(int i=0;i< arr.length;i++){
        if(arr[i]>=0){
            temp[p]=arr[i];
            p+=2;
        }
        else{
            temp[n]=arr[i];
            n+=2;
        }
    }

    for(int a:temp){
        System.out.print(a+" ");
    }
}

static void main() {
    int arr []={1,2,-4,-5,};
    RearrangeNegativePositive( arr);

}