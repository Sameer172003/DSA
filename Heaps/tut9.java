// Find k closest elements

import java.util.*;
public class tut9 {
    static class Pair{
        int diff,val;
        public Pair(int diff,int val){
            this.diff=diff;
            this.val=val;
        }
    }
    public static List<Integer> closest(int arr[],int k,int x){
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> sc=new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair p1,Pair p2){
                if(p2.diff == p1.diff){
                    return p2.val-p1.val;
                }
                else{
                    return p2.diff-p1.diff;
                }
            }
        });
        for(int num:arr){
            sc.add(new Pair(Math.abs(x-num),num));
            if(sc.size() > k){
                sc.poll();
            }
        }
        while(!sc.isEmpty()){
            ans.add(sc.poll().val);
        }

        Collections.sort(ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=4;
        int x=3;
        List<Integer> res=closest(arr, k, x);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
