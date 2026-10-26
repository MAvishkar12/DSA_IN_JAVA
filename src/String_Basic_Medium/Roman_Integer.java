
public static int  Roman_Integer (String s){
    int sum=0;
    HashMap<Character,Integer> h1=new HashMap<>();
    h1.put('I',1);
    h1.put('V', 5);
    h1.put('X', 10);
    h1.put('L', 50);
    h1.put('C', 100);
    h1.put('D', 500);
    h1.put('M', 1000);
    for(int i=0;i<s.length();i++){
        int current=h1.get(s.charAt(i));

        if(i+1<s.length() && current<h1.get(s.charAt(i+1))){ // if current is less then next char value minus
            // it if bigger add it to sum. Track that i not exceed the string length.
            sum-=current;
        }
        else {
            sum+=current;
        }


    }
    return sum;
}

static void main() {
    String s="XLII";
    int result=Roman_Integer(s);
    System.out.println(result);


}
