// Find the kth largest sum subarray

import java.util.*;
public class tut14 {
    public static int largest(int arr[],int k){
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sc.size() < k){
                    sc.add(sum);
                }
                else{
                    if(sc.peek() < sum){
                        sc.poll();
                        sc.add(sum);
                    }
                }
            }
        }
        return sc.peek();
    }
    public static void main(String args[]){
        int k=3;
        int arr[]={3,-2,5};
        System.out.println(largest(arr, k));
    }
}
