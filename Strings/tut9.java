// Isomorphic Strings

import java.util.*;
public class tut9 {
    public static boolean isomorphic(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="add";
        String t="egg";
        System.out.println(isomorphic(s, t));
    }
}
