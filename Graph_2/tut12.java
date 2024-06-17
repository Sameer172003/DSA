// Distance of nearest cell having 1

import java.util.LinkedList;
import java.util.Queue;

public class tut12 {
    static class Node{
        int first;
        int second;
        int third;
        public Node(int first,int second,int third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
    }
    public static int[][] nearest(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        Queue<Node> sc=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    sc.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};
        while(!sc.isEmpty()){
            int row=sc.peek().first;
            int col=sc.peek().second;
            int steps=sc.peek().third;
            sc.remove();

            dis[row][col]=steps;

            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
	            int ncol=col+delCol[i];
	            
	            if(nrow>=0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    sc.add(new Node(nrow,ncol,steps+1));
                }
            }
        }
        return dis;
    }
    public static void main(String args[]){

    }    
}
