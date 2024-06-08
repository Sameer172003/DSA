// Longest substring without repeating characters

import java.util.*;
public class tut2 {
    public static int substring(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,len=0;
        int n=s.length();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(substring(s));
        sc.close();
    }
}
