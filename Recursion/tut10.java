// Subset I

import java.util.*;
public class tut10 {
    public static void helper(int idx,int arr[],int sum,List<Integer> ans){
        if(idx == arr.length){
            ans.add(sum);
            return;
        }
        // Include
        helper(idx+1, arr, sum+arr[idx], ans);
        // Not Include
        helper(idx+1, arr, sum, ans);
    }
    public static List<Integer> subset(int arr[]){
        List<Integer> ans=new ArrayList<>();
        helper(0, arr, 0, ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={2,3};
        List<Integer> ans=new ArrayList<>();
        ans.addAll(subset(arr));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
