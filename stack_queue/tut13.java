// Convert Postfix to Prefix

import java.util.*;
public class tut13 {
    public static String postfixToprefix(String s){
        Stack<String> sc=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sc.push(ch+"");
            }
            else{
                String v2=sc.pop();
                String v1=sc.pop();
                char o=ch;
                res=o+v1+v2;
                sc.push(res);
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s="ab+cd-*";
        System.out.println(postfixToprefix(s));
    }
}
