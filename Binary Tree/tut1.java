// Preorder Traversal

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
public class tut1{
    static Node root;
    tut1() {
        root = null;
    }
    public static void helper(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.data);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public static ArrayList<Integer> preorder(Node root){
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void main(String args[]){
        tut1 tree=new tut1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Function call
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(preorder(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}