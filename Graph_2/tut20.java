// Shortest Path in Directed Acyclic Graph

import java.util.*;
public class tut20 {
    static class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static void topo(int node,ArrayList<ArrayList<Pair>> adj,int vis[],Stack<Integer> sc){
        vis[node]=1;
        for(int i=0;i<adj.get(node).size();i++){
            int v=adj.get(node).get(i).first;
            if(vis[v]==0){
                topo(v, adj, vis, sc);
            }
        }
        sc.push(node);
    }
    public static int[] directed(int edges[][],int n,int m){

        // Step 1: Make adjacency list

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Pair> temp=new ArrayList<Pair>();
            adj.add(temp);
        }
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }

        // Step 2: Apply Topological sort

        int vis[]=new int[n];
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                topo(i, adj, vis, sc);
            }
        }
        // Step 3: Make dist array and load with infinity

        int dist[]=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[0]=0;

        // Step 4: Travel all its neighbours 

        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.pop();

            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).first;
                int wt=adj.get(node).get(i).second;

                if(dist[node]+wt < dist[v]){
                    dist[v]=wt+dist[node];
                }
            }
        }
        // Step 5: Load all values in dist array
        for(int i=0;i<n;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
    }
    public static void main(String args[]){
        int n=4;
        int m=2;
        int edges[][]={{0,1,2},{0,2,1}};
        int ans[]=directed(edges, n, m);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
