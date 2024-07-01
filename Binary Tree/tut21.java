// Maximum Width of Binary Tree

import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Pair{
    Node node;
    int num;
    public Pair(Node node,int num){
        this.node=node;
        this.num=num;
    }
}
public class tut21 {
    static Node root;
    tut21(){
        root=null;
    }
    public static int width(Node root){
        if(root == null){
            return 0;
        }
        int ans=0;
        Queue<Pair> sc=new LinkedList<>();
        sc.add(new Pair(root,0));

        while(!sc.isEmpty()){
            int size=sc.size();
            int min=sc.peek().num;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int curr=sc.peek().num-min;
                Node node=sc.peek().node;
                sc.poll();
                if(i == 0) first=curr;
                if(i == size-1) last=curr;

                if(node.left != null){
                    sc.add(new Pair(node.left, curr*2+1));
                }
                if(node.right != null){
                    sc.add(new Pair(node.right, curr*2+2));
                }
                ans=Math.max(ans,last-first+1);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        tut21 tree=new tut21();
        tree.root=new Node(1);
        tree.root.left=new Node(3);
        tree.root.right=new Node(2);
        tree.root.left.left=new Node(5);

        System.out.println(width(root));
    }
}
