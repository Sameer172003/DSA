// Print all subsequence or subset of a given String / Power set

import java.util.*;
public class tut4 {
    public static void helper(int idx,String s,String temp,ArrayList<String> ans){
        if(idx == s.length()){
            if(temp.length() != 0){
                ans.add(temp);
            }
            return;
        }
        // Not Include
        helper(idx+1, s, temp, ans);
        // Include
        helper(idx+1, s, temp+s.charAt(idx), ans);
    }
    public static ArrayList<String> subset(String s){
        String temp="";
        ArrayList<String> ans=new ArrayList<>();
        helper(0, s, temp, ans);
        return ans;
    }
    public static void main(String args[]){
        String s="abc";
        ArrayList<String> ans=new ArrayList<>();
        ans.addAll(subset(s));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
