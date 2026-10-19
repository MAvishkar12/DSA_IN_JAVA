

public static void RearrangeNegativePositive2(int arr[]) {

    int p=0;
    int n=0;// calculate array size
    for(int a:arr){
        if(a>=0){

            p++;
        }
        else{

            n++;
        }
    }
   // store positive and negative elements in separate array
    int pi=0;
    int positive[]=new int[p];
    int  negative[]=new int[n];
    int ni=0;

    for(int a:arr){
        if(a>=0){
            positive[pi]=a;
            pi++;
        }
        else{
            negative[ni]=a;
            ni++;
        }
    }

    int i=0;
    int p1=0;
    int n1=0;

    while (p1< positive.length && n1< negative.length){
        arr[i++]=positive[p1++] ;
        arr[i++]=negative[n1++];
    }

    while (p1<positive.length){
        arr[i++]=positive[p1++] ;
    }
    while (n1< negative.length){
        arr[i++]=negative[n1++];
    }

    for(int a:arr){
        System.out.print(a+" ");
    }
}

static void main() {
    int arr[]={2,4,5,-1,-3,-4,-7};
    RearrangeNegativePositive2(arr);

}