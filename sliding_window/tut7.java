// Longest substring with atmost k distinct characters

import java.util.*;
public class tut7 {
    public static int longest(String s,int k){
        int n=s.length();
        int l=0,r=0,len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size() > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if(map.size() <= k){
                if(map.size() == k){
                    len=Math.max(len,r-l+1);
                }
                r++;
            }
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(longest(s, k));
        sc.close();
    }
}
