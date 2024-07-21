// Sliding Window Maximum

import java.util.Deque;
import java.util.LinkedList;

public class tut28 {
    public static int[] sliding(int arr[],int k){
        int n=arr.length;
        int res[]=new int[n-k+1];
        Deque<Integer> sc=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && sc.peek() < i-k+1){
                sc.pollFirst();
            }
            while(!sc.isEmpty() && arr[i] > arr[sc.peek()]){
                sc.pollLast();
            }
            sc.offer(i);
            if(i>=k-1){
                res[i-k+1]=arr[sc.peek()];
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int ans[]=sliding(arr, k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }    
}
