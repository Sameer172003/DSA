// Valid Parentheses

import java.util.*;
public class tut7 {
    public static boolean isValid(String s){
        Stack<Character> open=new Stack<>();
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            if(str=='(' || str=='[' || str=='{'){
                open.push(str);
            }
            else{
                if(open.isEmpty()){
                    return false;
                }
                else if((open.peek()=='(' && str==')')||(open.peek()=='[' && str==']')
                ||(open.peek()=='{' && str=='}')){
                    open.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(open.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
        sc.close();
    }
}
