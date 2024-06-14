// Set matrix zeroes

import java.util.*;
public class tut27 {
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setMat(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        boolean fr=false;
        boolean fc=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    if(i == 0)fr=true;
                    if(j == 0)fc=true;
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        if(fr){
            for(int j=0;j<m;j++){
                mat[0][j]=0;
            }
        }
        if(fc){
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        setMat(arr);
        display(arr);
        sc.close();
    }
}
