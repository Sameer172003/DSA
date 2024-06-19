// Convert Infix to Postfix

import java.util.*;
public class tut9 {
    public static int prec(char ch){
        switch(ch){
            case'+':
            case'-':
             return 1;
            case'*':
            case'/':
              return 2; 
            case'^':
              return 3;  
        }
        return -1;
    }
    public static String infixTopostfix(String s){
        Stack<Character> sc=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
            else if(ch=='('){
                sc.push(ch);
            }
            else if(ch==')'){
                while(!sc.isEmpty() && sc.peek()!='('){
                    res+=sc.pop();
                }
                sc.pop();
            }
            else{
                while(!sc.isEmpty() && prec(ch) <= prec(sc.peek())){
                    res+=sc.pop();
                }
                sc.push(ch);
            }
        }
        while(!sc.isEmpty()){
            res+=sc.pop();
        }
        return res;
    }
    public static void main(String args[]){
        String s="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixTopostfix(s));
    }
}
