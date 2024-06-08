// Maximum sum subarray of size k

import java.util.*;
public class tut9 {
    public static int window(int arr[],int n,int k){
        int l=0,r=0;
        int max=0,sum=0;
        while(r<n){
            sum=sum+arr[r];
            if(r-l+1 == k){
                max=Math.max(max,sum);
                sum=sum-arr[l];
                l++;
            }
            r++;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(window(arr, n, k));
        sc.close();
    }    
}
