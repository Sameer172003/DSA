// Inorder Traversal

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
public class tut2 {
    static Node root;

    tut2() {
        root = null;
    }
    public static void helper(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
    public static ArrayList<Integer> inorder(Node root){
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void main(String args[]){
        tut2 tree=new tut2();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Function call
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(inorder(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
