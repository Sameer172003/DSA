// Next smaller element (Right) 
// If (Left) then traverse from n-1 to 0

import java.util.*;
public class tut21 {
    public static int[] smaller(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()]>arr[i]){
                ans[sc.peek()]=arr[i];
                sc.pop();
            }
            sc.push(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int ans[]={1,3,2,4};
        int res[]=smaller(ans);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
