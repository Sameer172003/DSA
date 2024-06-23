// Cheapest Flights Within K Stops

import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Node{
    int first,second,third;
    Node(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
public class tut24 {
    public static int cheapest(int n,int flight[][],int src,int dst,int k){
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m=flight.length;
        for(int i=0;i<m;i++){
            adj.get(flight[i][0]).add(new Pair(flight[i][1],flight[i][2]));
        }
        int dist[]=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        Queue<Node> sc=new LinkedList<>();
        sc.add(new Node(0, src, 0));

        while(!sc.isEmpty()){
            Node it=sc.peek();
            sc.remove();
            int stops=it.first;
            int node=it.second;
            int cost=it.third;

            if(stops > k){
                continue;
            }
            for(Pair iter : adj.get(node)){
                int adjNode=iter.first;
                int edW=iter.second;

                if(edW+cost < dist[adjNode] && stops<= k){
                    dist[adjNode]=edW+cost;

                    sc.add(new Node(stops+1,adjNode, edW+cost));
                }
            }
        }
        if(dist[dst] == (int)1e9){
            return -1;
        }
        return dist[dst];
    }
    public static void main(String args[]){
        int n=4;
        int src=0;
        int dst=3;
        int k=1;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(cheapest(n, flight, src, dst, k));
    }
}
