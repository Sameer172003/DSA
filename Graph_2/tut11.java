// Bipartite graph

public class tut11 {
    public static boolean dfs(int node,int col,int vis[],int graph[][]){
        vis[node]=col;

        for(int it:graph[node]){
            if(vis[it]==-1){
                if(dfs(it, 1-col, vis, graph)==false){
                    return false;
                }
                else if(vis[it]==col){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isGraph(int graph[][]){
        int n=graph.length;

        int vis[]=new int[n];

        for(int i=0;i<vis.length;i++){
            vis[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                if(dfs(i,0,vis,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        
    }    
}
