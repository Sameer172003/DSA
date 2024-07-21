// Sum of subarray minimum

import java.util.*;
public class tut29 {
    public static int minimum(int arr[]){
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<n;i++){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=sc.peek();
            }
            sc.push(i);
        }
        sc.clear();
        for(int i=n-1;i>=0;i--){
            while(!sc.isEmpty() && arr[sc.peek()] >= arr[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=sc.peek();
            }
            sc.push(i);
        }
        long ans=0;
        int mod=(int)1e9+7;

        for(int i=0;i<n;i++){
            ans=ans+(long)(i-nsl[i])*(nsr[i]-i)%mod*arr[i]%mod;
            ans=ans%mod;
        }
        return (int)ans;
    }
    public static void main(String args[]){
        int arr[]={3,1,2,4};
        System.out.println(minimum(arr));
    }
}
