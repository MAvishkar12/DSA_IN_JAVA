

public static String LargeOddSubString (String s){

    for(int i=s.length()-1;i>=0;i--){

        if(s.charAt(i)%2==1){
            int j=0;
            while ( s.charAt(j)=='0')
            {
                j++;
            }
            return s.substring(j,i+1);

        }

    }
    return  "";
}

void main() {
    String s="012346";
    String result=LargeOddSubString(s);
    System.out.println(result);

}
