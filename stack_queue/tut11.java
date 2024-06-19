// Convert Prefix to Postfix

import java.util.*;
public class tut11 {
    public static String prefixTopostfix(String s){
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
                res=v1+v2+o;
                sc.push(res);
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s="*+ab-cd";
        System.out.println(prefixTopostfix(s));
    }
}
