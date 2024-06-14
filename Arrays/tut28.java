// Majority element II

import java.util.*;
public class tut28 {
    public static void display(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static List<Integer> majorityElement(int[] nums) {
        int cnt0=0;
        int cnt1=0;
        int val0=Integer.MIN_VALUE;
        int val1=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(cnt0 == 0 && val1 != nums[i]){
                cnt0=1;
                val0=nums[i];
            }
            else if(cnt1 == 0 && val0 != nums[i]){
                cnt1=1;
                val1=nums[i];
            }
            else if(val0 == nums[i]){
                cnt0++;
            }
            else if(val1 == nums[i]){
                cnt1++;
            }
            else{
                cnt0--;
                cnt1--;
            }
        }
        List<Integer>ans=new ArrayList<>();
        cnt0=0;
        cnt1=0;
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val0) cnt0++;
            if (nums[i] == val1) cnt1++;
        }
        int min=nums.length/3;
        if(cnt0 > min){
            ans.add(val0);
        }
        if(cnt1 > min){
            ans.add(val1);
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
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(majorityElement(arr));
        display(ans);
        sc.close();
    }
}
