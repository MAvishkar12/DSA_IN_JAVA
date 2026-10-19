

public static List<Integer> Duplicate1 (int arr[]) {
    List <Integer> l1=new ArrayList<>();

     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]==arr[j]){
                if(!l1.contains(arr[i])){
                    l1.add(arr[i]);
                }
               break;// avoid another match for same result in array
             }
         }
     }
      return  l1;
}

public static Map<Integer,Integer> Duplicate(int arr[]){
    HashMap<Integer,Integer> h1=new HashMap<>();

    for(int i=0;i< arr.length;i++){
        h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
    }

    HashMap <Integer,Integer> result=new HashMap<>();
    for(Map.Entry<Integer,Integer> arr2: h1.entrySet()){
         if(arr2.getValue()>1){
             result.put(arr2.getKey(),arr2.getValue());
         }
    }

    return  result;


}

 void main() {
  int arr[]={4, 7, 2, 7, 9, 4, 1, 4};
//   Map <Integer,Integer> result=Duplicate(arr);
//
//     System.out.println(result);
     List<Integer> res=Duplicate1(arr);
     System.out.println(res);
}
