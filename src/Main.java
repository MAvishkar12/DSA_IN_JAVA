
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import com.sun.security.jgss.GSSUtil;
public static void substringprint(String s){
    for(int i=0;i<s.length();i++){
        String  current="";
        for(int j=i;j<s.length();j++){
            current+=s.charAt(j);
            System.out.println(current);
        }

    }

}

void main() {
  String s="aabcb" ;
       substringprint(s);




    }

 ;







