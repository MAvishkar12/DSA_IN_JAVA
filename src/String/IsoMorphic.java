

public static boolean IsoMorphic (String s,String t){
    if(s.length()!=t.length()) return  false;
    HashMap<Character,Character> h1=new HashMap<>();
    HashMap<Character,Character> h2=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char a=s.charAt(i); // g
        char b=t.charAt(i);  //d
        if(h1.containsKey(a) && h1.get(a)!=b) return false;
        if(h2.containsKey(b) && h2.get(b)!=a) return false;

        h1.put(a,b);
        h2.put(b,a);
    }

    return  true;
}

 void main() {
     String s = "egg";
     String t="add";
     boolean result=IsoMorphic(s,t);
     System.out.println(result);
}
