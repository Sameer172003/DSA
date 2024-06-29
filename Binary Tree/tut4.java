// LevelOrder Traversal

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
public class tut4{
    static Node root;

    tut4() {
        root = null;
    }
    public static ArrayList<Integer> level(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> sc=new LinkedList<>();
        sc.add(root);
        if(root == null){
            return ans;
        }
        while(!sc.isEmpty()){
            Node temp=sc.poll();

            ans.add(temp.data);
            if(temp.left != null){
                sc.add(temp.left);
            }
            if(temp.right != null){
                sc.add(temp.right);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        tut4 tree=new tut4();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Function call
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(level(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}