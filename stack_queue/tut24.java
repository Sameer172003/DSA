// Asteroid Collision

import java.util.*;
public class tut24 {
    public static int[] collision(int asteroid[]){
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<asteroid.length;i++){
            if(asteroid[i]>0){
                sc.push(asteroid[i]);
            }
            else{
                while(!sc.isEmpty() && sc.peek()>0 && sc.peek() < -asteroid[i]){
                    sc.pop();
                }
                if(!sc.isEmpty() && sc.peek() > -asteroid[i]){
                    continue;
                }
                else if(!sc.isEmpty() && sc.peek() == -asteroid[i]){
                    sc.pop();
                }
                else{
                    sc.push(asteroid[i]);
                }
            }
        }
        int ans[]=new int[sc.size()];
        int i=ans.length-1;
        while(i>=0){
            ans[i--]=sc.pop();
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={3,5,-3};
        int ans[]=collision(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
