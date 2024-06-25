// Word Search

public class tut18 {
    public static boolean dfs(char board[][],String word,boolean vis[][],int i,int j,int idx){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || i>= board.length || j<0 || j>= board[0].length || vis[i][j] || board[i][j] != word.charAt(idx)){
            return false;
        }
        vis[i][j]=true;

        if(dfs(board,word,vis,i+1,j,idx+1) ||
        dfs(board,word,vis,i-1,j,idx+1)||
        dfs(board,word,vis,i,j+1,idx+1)||
        dfs(board,word,vis,i,j-1,idx+1)){
            return true;
        }

        vis[i][j]=false;
        return false;
    }
    public static boolean search(char grid[][],String word){
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        boolean res=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == word.charAt(0)){
                    res=dfs(grid, word, vis, i, j,0);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        char grid[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(search(grid, word));
    }
}
