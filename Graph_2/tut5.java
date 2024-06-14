// Detect a cycle in directed graph

import java.util.ArrayList;

public class tut5 {
    public static boolean dfs(int node,int pathVis[],int vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        pathVis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,pathVis,vis,adj)==true){
                    return true;
                }
            }
            else if(pathVis[it] == 1){
                return true;
            }
        }
        pathVis[node]=0;
        return false;
    }
    public static boolean detect(int V,ArrayList<ArrayList<Integer>> adj){
        int vis[]=new int[V];
        int pathVis[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                if(dfs(i,pathVis, vis, adj)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){

    }    
}
