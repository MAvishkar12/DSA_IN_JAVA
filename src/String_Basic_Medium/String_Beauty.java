

public  static  int  String_Beauty(String s) {
    int total=0;

    for(int i=0;i<s.length();i++){
        int temp []=new int[26];
        for(int j=i;j<s.length();j++) {
            temp[s.charAt(j) - 'a']++; // count occurrence  of each char in sub array
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int f : temp) {
                if (f > 0) {
                    max = Math.max(max, f); // calculate max in that substring
                    min = Math.min(min, f); // calculate min in that substring
                }
            }
            total += max - min; // calculate total for each sub string
        }
    }
    return  total;
}

void main() {
    String s="aabcb";
    int result=String_Beauty(s);
    System.out.println(result);
}
