// Susbset II

import java.util.*;
public class tut11 {
    public static void helper(int idx,int arr[],List<Integer> temp,List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            helper(idx+1, arr, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ansList = new ArrayList<>(); 
        helper(0, nums, new ArrayList<>(), ansList); 
        return ansList; 
    }
    public static void main(String args[]){
        int arr[]={1,2,2};
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(subsetsWithDup(arr));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
