// Maximum points you can obtain from cards

import java.util.*;
public class tut1{
    public static int maximum(int arr[],int n,int k){
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+arr[i];
            maxsum=lsum;
        }
        int ridx=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
            rsum=rsum+arr[ridx];
            ridx--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maximum(arr, n, k));
        sc.close();
    }
}