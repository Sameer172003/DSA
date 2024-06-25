// N Queens (Variation I)

import java.util.*;
public class tut19{
    public static ArrayList<ArrayList<String>> solveQueen(int n){
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(board,0);
        return ans;
    }
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left up
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal right up
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][], int row){
        //base
        if (row == board.length) {
            printBoard(board);
            return;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row+1); //function call
                board[row][j] = '.';   //backtracking step
            }
        }
    }
    public static void printBoard(char board[][]){
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String str = "";
            for (int j = 0; j < board.length; j++) {
                str += board[i][j];
            }
            ls.add(str);
        }
        ans.add(ls);
    }
    public static void main(String args[]){
        int n=4;
        ArrayList<ArrayList<String>> ans=solveQueen(n);
        int i = 1;
        for (ArrayList < String > it: ans) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}