// Kth largest element in an array

import java.util.*;
public class tut6 {
    public static int kth_largest(int arr[],int k){
        int n=arr.length;
        PriorityQueue<Integer> sc=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            sc.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(sc.peek() < arr[i]){
                sc.remove();
                sc.add(arr[i]);
            }
        }
        return sc.peek();
    }
    public static void main(String args[]){
        int k=3;
        int arr[]={1,5,2,3,4,6};
        System.out.println(kth_largest(arr, k));
    }
}
