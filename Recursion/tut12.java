// Letter Combinations of a Phone Number

import java.util.*;
public class tut12 {
    public static void helper(int idx,String digit,String output,List<String> ans,String map[]){
        if(idx >= digit.length()){
            ans.add(output);
            return;
        }
        String value=map[digit.charAt(idx)-'0'];
        for(int i=0;i<value.length();i++){
            helper(idx+1, digit, output+value.charAt(i), ans,map);
        }
    }
    public static List<String> keypad(String digit){
        String output="";
        List<String> ans=new ArrayList<>();
        int idx=0;
        String map[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digit.length() ==  0){
            return ans;
        }
        helper(idx, digit, output, ans,map);
        return ans;
    }
    public static void main(String args[]){
        String s="23";
        List<String> ans=new ArrayList<>();
        ans.addAll(keypad(s));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
