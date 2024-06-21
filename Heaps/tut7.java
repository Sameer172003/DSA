// Kth smallest element in an array

import java.util.*;
public class tut7 {
    public static int kth_smallest(int arr[],int k){
        int n=arr.length;
        PriorityQueue<Integer> sc=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            sc.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(sc.peek() > arr[i]){
                sc.remove();
                sc.add(arr[i]);
            }
        }
        return sc.peek();
    }
    public static void main(String args[]){
        int k=5;
        int arr[]={5,9,1,8,10,6,4};
        System.out.println(kth_smallest(arr, k));
    }
}
