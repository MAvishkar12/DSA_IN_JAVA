
public static void ReverseString(String str) {
    char arr[]=str.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]);
    }
    System.out.print("\n");
    for(int i= str.length()-1;i>=0;i--){

        System.out.print(str.charAt(i));
    }
}

 void main() {
    String st1="Avishkar";
     ReverseString(st1);

}
