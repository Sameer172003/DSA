// Kth largest element in a stream

import java.util.*;
public class tut10 {
    public static int[] largest(int arr[],int k){
        int n=arr.length;
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            sc.add(arr[i]);
            if(sc.size() > k){
                sc.poll();
            }
            if(sc.size() < k){
                ans[i]=-1;
            }
            else{
                ans[i]=sc.peek();
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int k=4;
        int res[]=largest(arr, k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
