// Valid Anagram

import java.util.*;
public class tut4 {
    public static boolean isValid(String a, String b){
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        boolean res=Arrays.equals(c, d);
        if(res == true){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String a="ram";
        String b="amm";

        System.out.println(isValid(a, b));
    }
}
