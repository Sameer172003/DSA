// Next greater element I (Right)
// If (Left) then traverse from n-1 to 0

import java.util.*;
public class tut20 {
    public static int[] greater(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()]<arr[i]){
                ans[sc.peek()]=arr[i];
                sc.pop();
            }
            sc.push(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int ans[]={1,3,2,4};
        int res[]=greater(ans);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
