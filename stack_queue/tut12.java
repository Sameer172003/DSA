// Convert Prefix to Infix

import java.util.*;
public class tut12 {
    public static String prefixToinfix(String s){
        Stack<String> sc=new Stack<>();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sc.push(ch+"");
            }
            else{
                String v1=sc.pop();
                String v2=sc.pop();
                char o=ch;
                res="("+v1+o+v2+")";
                sc.push(res);
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s="/-ab+-cde";
        System.out.println(prefixToinfix(s));
    }
}
