// Surrounded Regions

public class tut10 {
    public static void dfs(int row,int col,char board[][],int delRow[],int delCol[],int vis[][]){
        vis[row][col]=1;

        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && vis[nrow][ncol]==0){
                dfs(nrow,ncol,board,delRow,delCol,vis);
            }
        }
    }
    public static  char [][] solve(char board[][]){
        int n=board.length;
        int m=board[0].length;

        int vis[][]=new int[n][m];

        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O' && vis[i][j]==0){
                        dfs(i,j,board,delRow,delCol,vis);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
        return board;
    }
    public static void main(String args[]){

    }    
}
