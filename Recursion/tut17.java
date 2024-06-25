// M Coloring Problem

import java.util.*;
public class tut17 {
    public static boolean isSafe(boolean graph[][],int color[],int node,int n,int col){
        for(int i=0;i<n;i++){
            if(graph[node][i] && color[i] == col) return false;
        }
        return true;
    }
    public static boolean helper(int node,boolean graph[][],int color[],int m,int n){
        // Base Case
        if(node == n){
            return true;
        }
        for(int i=0;i<m;i++){
            if(isSafe(graph,color,node,n,i)){  // i -> Color to be added
                color[node]=i;
                if(helper(node+1, graph, color, m, n)) return true;
                color[node]=-1;
            }
        }
        return false;
    }
    public static boolean check(boolean graph[][],int m,int n){
        int color[]=new int[n];
        Arrays.fill(color,-1);
        boolean result=helper(0, graph, color, m, n);
        return result;
    }
    public static void main(String args[]){
        
    }    
}
