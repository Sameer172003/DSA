// Permutation of an array

import java.util.*;
public class tut6 {
    public static void swap(List<Integer> sl,int i,int j){
        int temp=0;
        temp=sl.get(i);
        sl.set(i,sl.get(j));
        sl.set(j,temp);
    }
    public static void helper(List<Integer> sl,List<List<Integer>> ans,int idx){
        if(idx == sl.size()){
            ans.add(new ArrayList<>(sl));
            return;
        }
        for(int k=idx;k<sl.size();k++){
            swap(sl, idx, k);
            helper(sl, ans, idx+1);
            swap(sl, idx, k);
        }
    }
    public static List<List<Integer>> permutation(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sl=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            sl.add(arr[i]);
            Collections.sort(sl);
        }
        helper(sl, ans, 0);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(permutation(arr));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
