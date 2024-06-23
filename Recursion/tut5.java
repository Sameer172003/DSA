// Generate all parentheses

import java.util.*;
public class tut5 {
    public static void helper(String s,int o,int c,int n,ArrayList<String> ans){
        // Base Case
        if(c == n){
            ans.add(s);
            return;
        }
        if(o < n){
            helper(s+"(", o+1, c, n, ans);
        }
        if(o > c){
            helper(s+")", o, c+1, n, ans);
        }
    }
    public static ArrayList<String> generate(int n){
        ArrayList<String> ans=new ArrayList<>();
        String s="";
        helper(s,0,0, n, ans);
        return ans;
    }
    public static void main(String args[]){
        int n=2;
        ArrayList<String> ans=new ArrayList<>();
        ans.addAll(generate(n));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
