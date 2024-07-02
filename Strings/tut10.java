// Roman to Integer

import java.util.*;
public class tut10 {
    public static int RomantoInteger(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans=0;

        for(int i=0;i<s.length();i++){
            if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans=ans-map.get(s.charAt(i));
            }
            else{
                ans=ans+map.get(s.charAt(i));
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String s="III";
        System.out.println(RomantoInteger(s));
    }    
}
