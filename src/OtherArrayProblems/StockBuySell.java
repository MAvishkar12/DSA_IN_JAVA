
//public static int StockBuySell (int arr[]){
//    int max=0;
//    int val=0;
//    for(int i=0;i<arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//            if(arr[j]>arr[i]){
//                val=arr[j]-arr[i];
//               max=Math.max(max,val);
//            }
//        }
//    }
//  return   max;
//}

//For any given selling day, the best buying day is the cheapest day before it.
// So, walking through the array once:

public static int StockBuySell(int arr[]){
    int minprice=Integer.MAX_VALUE; // find the minium element in array and find max diff with other elements
    int max=0;
    for(int price:arr){
        if(price<minprice){
            minprice=price;

        }
        else {
            max=Math.max(max,price-minprice);
        }
    }
    return  max;
}
 void main() {
    int arr[]={7,1,5,3,6,4};
    int result=StockBuySell(arr);
     System.out.println("Max stock diff "+result);
}