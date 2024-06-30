// Top View of Binary Tree


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
    int hd;
    Node node;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
public class tut13 {
    static Node root;
    tut13(){
        root=null;
    }
    public static ArrayList<Integer> top(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Pair> sc=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        sc.add(new Pair(root, 0));

        while(!sc.isEmpty()){
            Pair it=sc.poll();
            int hd=it.hd;
            Node temp=it.node;

            if(map.get(hd) == null) map.put(hd,temp.data);
            if(temp.left != null){
                sc.add(new Pair(temp.left, hd-1));
            }
            if(temp.right != null){
                sc.add(new Pair(temp.right, hd+1));
            }
        }
        for(int value:map.values()){
            ans.add(value);
        }
        return ans;
    }
    public static void main(String args[]){
        tut13 tree=new tut13();
        tree.root=new Node(1);
        tree.root.left=new Node(3);
        tree.root.right=new Node(2);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(top(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
