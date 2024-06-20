// Shortest Path in undirected graph

import java.util.*;
public class tut19 {
    public static int[] undirected(int edges[][],int n,int m,int src){
        
        // Step 1: Make adjacency list

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        // Step 2: Make dist array and initialize with infinity

        int dist[]=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;

        // Step 3: Make a Queue and add a source into it

        Queue<Integer> sc=new LinkedList<>();
        sc.add(src);

        // Step 4: Travel all its neighbours

        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.remove();
            for(int it:adj.get(node)){
                if(dist[node]+1 < dist[it]){
                    dist[it]=1+dist[node];
                    sc.add(it);
                }
            }
        }
        // Step 5: Load all value in dist array

        for(int i=0;i<n;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
    }
    public static void main(String args[]){
        int n=9;
        int m=10;
        int src=0;
        int edges[][]={{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};

        int ans[]=undirected(edges, n, m, src);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
