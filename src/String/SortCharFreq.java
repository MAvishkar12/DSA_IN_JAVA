

public static String SortCharFreq (String s){

    HashMap<Character,Integer> h1=new HashMap<>();
    for(int i=0;i< s.length();i++){
        h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
    }
    List<Character> [] ll=new List[s.length()+1]; // create a null array [[null],[null],..]
    for(Map.Entry<Character,Integer> ans:h1.entrySet()){
        int f=ans.getValue();
        if(ll[f]==null){
            ll[f]=new ArrayList<>(); // create an array list at index where index is null
        }
        ll[f].add(ans.getKey());

    }
    StringBuilder sc=new StringBuilder();
     for(int i=s.length();i>0;i--){
         if(ll[i]==null) continue;
        for(char c:ll[i]){
            for(int k=0;k<i;k++){
                sc.append(c);

            }
        }


     }
     return  sc.toString();
    }





 void main() {
    String s="tree";
   String result=SortCharFreq(s);
    System.out.println(result);

}