// Kth Largest Element in a BST

import java.util.ArrayList;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.left=null;
        this.right=null;
    }
}
public class tut6 {
    static Node root;
    tut6(){
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
    public static int largest(Node root,int k){
        if(k>totalNodes(root)) return -1;
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int res = 0;
        for(int i = ans.size()-1; i >= 0; i--){
            if(k == 0){
                break;
            }
            res = ans.get(i);
            k--;
        }
        return res;
    }
    public static void main(String args[]){
        tut6 tree=new tut6();

        tree.root=new Node(4);
        tree.root.left=new Node(2);
        tree.root.right=new Node(9);

        int k=2;
        System.out.println(largest(root, k));
    }
}
