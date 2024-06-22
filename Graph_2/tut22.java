// Shortest Path in Binary Matrix

import java.util.*;
public class tut22 {
    static class Node{
        int first,second,third;
        public Node(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static int binary(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;
        // Base case
        if(grid[0][0] != 0 && grid[n-1][n-1] != 0){
            return -1;
        }
        if(n-1 == 0){
            return 1;
        }
        // Step : 1 
        Queue<Node> sc=new LinkedList<>();
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        sc.add(new Node(0,0,0));
        int dr[] = {0, -1, -1, -1, 0, 1, 1, 1};
        int[] dc = {-1, -1, 0, 1, 1, 1, 0, -1};

        // Step : 2
        while(!sc.isEmpty()){
            Node it=sc.peek();
            sc.poll();

            int dis=it.first;
            int row=it.second;
            int col=it.third;

            for(int i=0;i<8;i++){
                int nr=row+dr[i];
                int nc=col+dc[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==0 && dis+1 < dist[nr][nc]){
                    dist[nr][nc]=dis+1;

                    if(nr == n-1 && nc == n-1){
                        return dis+2;
                    }
                    sc.add(new Node(dis+1,nr,nc));
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[][]={{0,1},{1,0}};
        System.out.println(binary(arr));
    }
}
