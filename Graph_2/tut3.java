// Number of provinces

import java.util.*;
public class tut3 {
    public int provinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int pro = 0;
        int vis[] = new int[V];
        
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                pro++;
                dfs(vis, adj, i);
            }
        }
        return pro;
    }
    public static void dfs(int vis[], ArrayList<ArrayList<Integer>> adj, int node) {
        vis[node] = 1;
        
        for (int i = 0; i < adj.get(node).size(); i++) {
            if (adj.get(node).get(i) == 1 && vis[i] == 0) {
                dfs(vis, adj, i);
            }
        }
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);
                
        tut3 ob = new tut3();
        System.out.println(ob.provinces(adj,3));
    }
}
