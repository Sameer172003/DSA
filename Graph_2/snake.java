// Snakes and Ladders

import java.util.*;
public class snake {
    public static int snakeAndladder(int arr[][]){
        int n=arr.length;
        int step=0;
        Queue<Integer> sc=new LinkedList<>();
        boolean vis[][]=new boolean[n][n];
        sc.add(1);
        vis[n-1][0]=true;

        while(!sc.isEmpty()){
            int size=sc.size();
            for(int i=0;i<size;i++){
                int x=sc.poll();
                if(x == n*n) return step;
                for(int k=1;k<=6;k++){
                    if(k+x > n*n) break;
                    int pos[]=find(k+x,n);
                    int r=pos[0];
                    int c=pos[1];
                    if(vis[r][c] == true) continue;
                    vis[r][c]=true;
                    if(arr[r][c] == -1){
                        sc.add(k+x);
                    }
                    else{
                        sc.add(arr[r][c]);
                    }
                }
            }
            step++;
        }
        return -1;
    }
    public static int[] find(int curr,int n){
        int r=n-(curr-1)/n -1;
        int c=(curr-1)%n;
        if(r%2 == n%2){
            return new int[]{r,n-1-c};
        }
        else{
            return new int[]{r,c};
        }
    }
    public static void main(String args[]){
        int arr[][]={{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,35,-1,-1,13,-1},{-1,-1,-1,-1,-1,-1},{-1,15,-1,-1,-1,-1}};
        System.out.println(snakeAndladder(arr));
    }
}
