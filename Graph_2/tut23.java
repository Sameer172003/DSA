// Path With Minimum Effort

import java.util.*;
public class tut23 {
    static class Node{
        int first,second,third;
        public Node(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static int effort(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        
        // Step : 1 
        PriorityQueue<Node> sc=new PriorityQueue<>((a,b)->a.first-b.first);
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        sc.add(new Node(0,0,0));
        int dr[] = {-1, 0, 1, 0}; 
        int dc[] = {0, 1, 0, -1}; 

        // Step : 2
        while(!sc.isEmpty()){
            Node it=sc.peek();
            sc.poll();

            int diff=it.first;
            int row=it.second;
            int col=it.third;

            if(row == n-1 && col == m-1){
                return diff;
            }

            for(int i=0;i<4;i++){
                int nr=row+dr[i];
                int nc=col+dc[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int newEffort=Math.max(Math.abs(grid[row][col]-grid[nr][nc]),diff);
                    if(newEffort < dist[nr][nc]){
                        dist[nr][nc]=newEffort;
                        sc.add(new Node(newEffort,nr,nc));
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(effort(arr));
    }
}
