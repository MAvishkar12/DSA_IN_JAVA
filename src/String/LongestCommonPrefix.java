
// consider first element as prefix and shrink it last char until it match.
// if prefix match return empty string
public static String LongestCommonPrefix (String arr[]){
     if(arr.length==0) return  " ";
     String prefix=arr[0];
     for(int i=1;i<arr.length;i++){
         while (!arr[i].startsWith(prefix)){
             prefix=prefix.substring(0, prefix.length()-1 );
             if(prefix.isEmpty()) return  " ";
         }
     }
     return  prefix;
    }


    void main() {
    String arr []={"flowers" , "flow" , "fly", "flight" };
    String sc=LongestCommonPrefix(arr);
    System.out.println(sc);
}
