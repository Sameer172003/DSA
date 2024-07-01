// Flatten binary tree to linked list

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut24 {
    static Node root;
    tut24(){
        root=null;
    }
    public static void helper(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.data);
        helper(root.left, ans);
        helper(root.right, ans);
    }
    public static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public static void flatten(Node root){
        while(root != null){
            if(root.left == null){
                root=root.right;
            }
            else{
                Node curr=root.left;
                while(curr.right != null){
                    curr=curr.right;
                }
                curr.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }
    }
    public static void main(String args[]){
        tut24 tree=new tut24();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(5);
        tree.root.left.left=new Node(3);
        tree.root.left.right=new Node(4);
        tree.root.right.right=new Node(6);

        flatten(root);
    }
}
