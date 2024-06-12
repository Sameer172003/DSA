// BFS

import java.util.*;
public class tut1{
    public ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[V];
        Queue<Integer> sc=new LinkedList<>();

        sc.add(0);
        vis[0]=true;

        while(!sc.isEmpty()){
            int node=sc.poll();
            ans.add(node);

            for(int it:adj.get(node)){
                if(vis[it] == false){
                    vis[it]=true;
                    sc.add(it);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        tut1 sl = new tut1(); 
        ArrayList < Integer > ans = sl.bfs(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
}

