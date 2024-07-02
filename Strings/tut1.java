// Reverse a word / string

import java.util.*;
public class tut1{
    public static String reverse(String s){
        Stack<Character> sc=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sc.push(ch);
        }
        while(!sc.isEmpty()){
            ans+=sc.pop();
        }
        return ans;
    }
    public static void main(String args[]){
        String s="Sameer";
        System.out.println(reverse(s));
    }
}