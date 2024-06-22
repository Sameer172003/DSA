// Dijkstra Algorithm

import java.util.*;
class Pair{
    int node;
    int distance;
    public Pair(int distance,int node){
        this.node = node;
        this.distance = distance;
    }
}
public class tut21 {
    public static int[] dijkstra(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj,int s){
        PriorityQueue<Pair> sc=new PriorityQueue<>((x,y)->x.distance-y.distance);
        int dist[]=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[s]=0;
        sc.add(new Pair(0, s));

        while(!sc.isEmpty()){
            int dis=sc.peek().distance;
            int node=sc.peek().node;
            sc.remove();

            for(int i=0;i<adj.get(node).size();i++){
                int edgeWt=adj.get(node).get(i).get(1);
                int adjNode=adj.get(node).get(i).get(0);

                if(dis+edgeWt < dist[adjNode]){
                    dist[adjNode]=dis+edgeWt;
                    sc.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
    public static void main(String args[]){

    }
}
