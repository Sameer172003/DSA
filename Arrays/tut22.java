// Next Permutation

import java.util.*;
public class tut22 {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int nums[],int s,int e){
        while(s < e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public static void nextPermutation(int[] nums) {
        // Step:1- Find break point
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx=i;
                break;
            }
        }
        // If break point does not exist
        if (idx == -1) {
            // reverse the whole array:
            reverse(nums,0,n-1);
            return;
        }
        // Step 2: Find the next greater element
        //     and swap it with arr[idx]
        else{
            for(int i=n-1;i>idx;i--){
                if(nums[i] > nums[idx]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            // Step 3: reverse the right half
            reverse(nums,idx+1,n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextPermutation(arr);
        display(arr);
        sc.close();
    }
}
