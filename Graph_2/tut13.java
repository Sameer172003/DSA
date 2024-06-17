// Rotten Oranges

import java.util.*;
public class tut13 {
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
    public static int oranges(int grid[][]){
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        int cntFresh=0;
        Queue<Node> sc=new LinkedList<>();
        
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    sc.add(new Node(i,j,0));
                    vis[i][j]=2;
                }
                else if(grid[i][j]==1){
                    cntFresh++;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int tm=0;
        int cnt=0;
        while(!sc.isEmpty()){
            int row=sc.peek().first;
            int col=sc.peek().second;
            int t=sc.peek().third;
            sc.remove();

            tm = Math.max(t, tm);

            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    sc.add(new Node(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt != cntFresh){
            return 1;
        }
        else{
            return tm;
        }
    }
    public static void main(String args[]){
        int grid[][]={{0,1,2},{0,1,2},{2,1,1}};
        System.out.println(oranges(grid));
    }
}
