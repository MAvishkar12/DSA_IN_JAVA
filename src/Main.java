
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  static  int[] count(int arr[]){
   int maxfreq=Integer.MIN_VALUE;
   int minfreq=Integer.MAX_VALUE;
    HashMap<Integer,Integer> h1=new HashMap<>();
    for(int i=0;i<arr.length;i++){
     h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
    }

    for(int a:h1.values()){
        maxfreq=Math.max(a,maxfreq);
        minfreq=Math.min(a,minfreq);
    }



    return new int [] {maxfreq,minfreq};
}

void main() {
  int arr[]={4, 4, 5, 5, 6, 7};
  int result[]=count(arr);
    System.out.println(Arrays.toString(result));

    }

 ;







