// Kth Missing Positive Number

import java.util.*;
public class tut39 {
    public static int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findKthPositive(arr, k));
        sc.close();
    }
}
