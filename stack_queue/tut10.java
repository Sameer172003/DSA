// Infix to Prefix

import java.util.*;
public class tut10 {
    public static String rev(String s){
        Stack<Character> sc=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sc.push(ch);
        }
        while(!sc.isEmpty()){
            res+=sc.pop();
        }
        return res;
    }
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
    public static String infixToprefix(String s){
        Stack<Character> sc=new Stack<>();
        String res="";
        s=rev(s);
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
        String ans=rev(res);
        return ans;
    }
    public static void main(String args[]){
        String s="a*b+c/d";
        System.out.println(infixToprefix(s));
    }
}
