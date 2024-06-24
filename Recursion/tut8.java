// Combination Sum I

import java.util.*;
public class tut8 {
    public static void helper(int idx,int target,int arr[],List<Integer> temp,List<List<Integer>> ans){
        // Base Case
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[idx] <= target){
            // Include
            temp.add(arr[idx]);
            helper(idx, target-arr[idx], arr, temp, ans);
            temp.remove(temp.size()-1);
        }
        // Not Include
        helper(idx+1, target, arr, temp, ans);
    }
    public static List<List<Integer>> sum(int arr[],int target){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(0, target, arr, temp, ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={2,3,6,7};
        int target=7;
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(sum(arr, target));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
