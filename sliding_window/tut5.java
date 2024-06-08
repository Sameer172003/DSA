// Number of substrings containing all three characters

import java.util.*;
public class tut5 {
    public static int contain(String s){
        int n=s.length();
        int cnt=0;
        int hash[]=new int[3];
        Arrays.fill(hash,-1);
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                cnt+=1+Math.min(Math.min(hash[0],hash[1]),hash[2]);
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(contain(s));
        sc.close();
    }  
}
