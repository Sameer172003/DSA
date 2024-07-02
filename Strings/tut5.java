// Remove Outermost Parentheses

import java.util.*;
public class tut5 {
    public static String remove(String s){
        Stack<Character> sc=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '('){
                if(sc.size() > 0){
                    sb.append(ch);
                }
                sc.push(ch);
            }
            else{
                sc.pop();
                if(sc.size() > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String s="(())";
        System.out.println(remove(s));
    }
}
