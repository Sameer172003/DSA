// Duplicate Parentheses

import java.util.*;
public class tut15 {
    public static boolean isduplicate(String s){
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(sc.peek()=='('){
                    return true;
                }
                else{
                    while(sc.peek() != '('){
                        sc.pop();
                    }
                    sc.pop();
                }
            }
            else{
                sc.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String s="(a+b)+(c+d)";
        System.out.println(isduplicate(s));
    }
}
