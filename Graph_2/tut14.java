// Topological Sort using DFS

import java.util.*;
public class tut14 {
    public static void dfs(int node,int vis[],Stack<Integer> sc,List<List<Integer>> adj){
        vis[node]=1;

        for(int it:adj.get(node)){
            if(vis[it]==0){
                dfs(it, vis, sc, adj);
            }
        }
        sc.push(node);
    }
    public static int[] topoSort(int V,List<List<Integer>> adj){
        int vis[]=new int[V];
        Stack<Integer> sc=new Stack<>();

        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,sc,adj);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!sc.isEmpty()){
            ans[i++]=sc.peek();
            sc.pop();
        }
        return ans;
    }
    public static void main(String args[]){
        
    }
}
