

public  static void  Reverse_II (List<Character> s) {
    System.out.println(s.size());
    for(int i=s.size()-1;i>=0;i--){
        System.out.print(s.get(i));
    }

}

static void main() {
    List<Character> arr = new ArrayList<>(List.of('h', 'e', 'l', 'l', 'o'));
    Reverse_II(arr);
}