// N Queen(Variation II)

import java.util.*;
public class tut20 {
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        boolean[][] board = new boolean[n][n];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        nq(board, 0, res);
        return res;
    }
    
    
    static void nq(boolean[][] board, int row, ArrayList<ArrayList<Integer>> res) {
        if(row==board.length) {
            res.add(display(board));
            return;
        }
        
        for(int col = 0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                nq(board, row+1, res);
                board[row][col] = false;
            }
        }
    }
    
    static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0; i<row; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        
        int maxLeft = Math.min(row, col);
        for(int i = 1; i<=maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }
        
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1; i<=maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }
    
    static ArrayList<Integer> display(boolean[][] board) {
        ArrayList<Integer> sol = new ArrayList<>();
        
        for(boolean[] row : board) {
            int qcol = -1;
            
            for(int j = 0; j<row.length; j++) {
                if(row[j]) {
                    qcol = j;
                    break;
                }
            }
            sol.add(qcol+1);
        }
        return sol;
    }
    public static void main(String args[]){
        int n=4;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans.addAll(nQueen(n));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
