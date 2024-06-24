// Print all subsequence or subset of a given array / Power set

import java.util.*;
public class tut3 {
    public static void helper(int idx,int arr[],ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(idx == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // Not Include
        helper(idx+1, arr, temp, ans);
        // Include
        temp.add(arr[idx]);
        helper(idx+1, arr, temp, ans);
        temp.remove(temp.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> subset(int arr[]){
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        helper(0, arr, temp, ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans.addAll(subset(arr));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
