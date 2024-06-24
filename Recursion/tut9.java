// Combination Sum II

import java.util.*;
public class tut9 {
    public static void helper(int idx,int target,int arr[],List<Integer> temp,List<List<Integer>> ans){
        // Base Case
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            // Include
            if(i > idx && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }
            temp.add(arr[i]);
            helper(i+1, target-arr[i], arr, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> sum(int arr[],int target){
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(0, target, arr, temp, ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(sum(arr, target));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
