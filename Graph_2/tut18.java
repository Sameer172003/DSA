// Find the eventual safe nodes/states

import java.util.*;
public class tut18 {
    public static List<Integer> safe(int graph[][]){
        ArrayList<ArrayList<Integer>> rev=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            rev.add(new ArrayList<>());
        }
        int indegree[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int it:graph[i]){
                rev.get(it).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> sc=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(indegree[i] == 0){
                sc.add(i);
            }
        }
        while(!sc.isEmpty()){
            int node=sc.peek();
            sc.remove();
            ans.add(node);
            for(int it:rev.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    sc.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String args[]){
        int graph[][]={{1,2},{2,3},{5},{0},{5},{},{}};
        List<Integer> ans=safe(graph);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
