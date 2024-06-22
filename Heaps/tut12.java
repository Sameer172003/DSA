// Merge k sorted arrays

import java.util.*;
public class tut12 {
    static class Node{
        int data;
        int row;
        int col;
        public Node(int data,int row,int col){
            this.data=data;
            this.row=row;
            this.col=col;
        }
    }
    public static ArrayList<Integer> sorted(int arr[][],int k){
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Node> sc=new PriorityQueue<>((a,b)->a.data-b.data);

        for(int i=0;i<k;i++){
            sc.add(new Node(arr[i][0],i,0));
        }
        while(!sc.isEmpty()){
            Node temp=sc.remove();
            ans.add(temp.data);

            int row=temp.row;
            int col=temp.col;

            if(col+1 < arr[row].length){
                sc.add(new Node(arr[row][col+1], row, col+1));
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int k=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=sorted(arr, k);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
