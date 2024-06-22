// Top K frequent elements

import java.util.*;
public class tut8 {
    public static int[] top(int k,int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> sc=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        sc.addAll(map.keySet());
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=sc.poll();
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]={1,1,1,2,2,3};
        int k=2;
        int res[]=top(k, nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }   
    }
}
