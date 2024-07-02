// Sort Characters By Frequency

import java.util.*;
public class tut13 {
    public static String frequencySort(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> sc=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        sc.addAll(map.keySet());

        StringBuilder ans=new StringBuilder();
        while(!sc.isEmpty()){
            char ch=sc.poll();
            for(int i=0;i<map.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        String s="tree";
        System.out.println(frequencySort(s));
    }
}
