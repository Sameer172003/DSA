// Connect n ropes with minimum cost

import java.util.*;
public class tut11 {
    public static int minimum(int arr[]){
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            sc.add(arr[i]);
        }
        int ans=0;
        while(sc.size() > 1){
            int f=sc.poll();
            int s=sc.poll();
            int sum=f+s;
            ans+=sum;
            sc.add(sum);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={4, 3, 2, 6};
        System.out.println(minimum(arr));
    }
}
