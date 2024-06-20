// Next Greater Element II

import java.util.*;
public class tut22 {
    public static int[] greater(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<2*n;i++){
            while(!sc.isEmpty() && arr[sc.peek()]<arr[i%n]){
                ans[sc.peek()]=arr[i%n];
                sc.pop();
            }
            if(i<n){
                sc.push(i);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int ans[]={1,2,1};
        int res[]=greater(ans);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
