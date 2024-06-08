// count binary subarrays with sum k

import java.util.*;
public class tut3 {
    public static int max(int arr[],int n,int k){
        return help(arr, n, k)-help(arr, n, k-1);
    }
    public static int help(int arr[],int n,int k){
        int l=0,r=0,sum=0,cnt=0;
        if(k<0){
            return 0;
        }
        while(r<n){
            sum=sum+arr[r];
            while(sum>k){
                sum=sum-arr[l];
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(max(arr, n, k));
        sc.close();
    }
}
