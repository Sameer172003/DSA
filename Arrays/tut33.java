// Maximum Product Subarray

import java.util.*;
public class tut33 {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int pre=1,suff=1;

        for(int i=0;i<n;i++){
            if(pre == 0) pre=1;
            if(suff == 0) suff=1;
            pre=pre*nums[i];
            suff=suff*nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr));
        sc.close();
    }
}
