// Topological Sort using BFS (Kahn's Algorithm)

import java.util.*;
public class tut15 {
    public static int[] topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        int inDeg[]=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                inDeg[it]++;
            }
        }
        Queue<Integer> sc=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDeg[i]==0){
                sc.add(i);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.remove();
            ans[i++]=node;

            for(int it:adj.get(node)){
                inDeg[it]--;
                if(inDeg[it]==0){
                    sc.add(it);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){

    }
}
