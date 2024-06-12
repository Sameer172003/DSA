// DFS

import java.util.*;
public class tut2 {
    public static void helper(int node,boolean vis[],ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        ans.add(node);

        for(int it:adj.get(node)){
            if(vis[it] == false){
                helper(it, vis, ans, adj);
            }
        }
    }
    public ArrayList<Integer> dfs(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V+1];
        vis[0] = true; 
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, vis, ans, adj);
        return ans;
    }
    public static void main(String args[]){
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        
        tut2 sl = new tut2(); 
        ArrayList < Integer > ans = sl.dfs(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
}

