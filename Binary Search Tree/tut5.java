// Kth Smallest Element in a BST

import java.util.ArrayList;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.left=null;
        this.right=null;
    }
}
public class tut5 {
    static Node root;
    tut5(){
        root=null;
    }
    static int totalNodes(Node root)
    {
        if (root == null)
            return 0;
     
        int l = totalNodes(root.left);
        int r = totalNodes(root.right);
     
        return 1 + l + r;
    }
    public static void inorder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public static int smallest(Node root,int k){
        if(k>totalNodes(root)) return -1;
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans.get(k-1);
    }
    public static void main(String args[]){
        tut5 tree=new tut5();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);

        int k=5;
        System.out.println(smallest(root, k));
    }
}
