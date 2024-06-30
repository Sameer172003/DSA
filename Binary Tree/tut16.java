// Boundary Traversal in Binary Tree

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
public class tut16 {
    static Node root;
    tut16(){
        root=null;
    }
    public static boolean isLeaf(Node root){
        return root.left == null && root.right == null; 
    }
    public static void left(Node root,ArrayList<Integer> res){
        Node curr=root.left;
        while(curr != null){
            if(isLeaf(curr) == false){
                res.add(curr.data);
            }
            if(curr.left != null){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    public static void right(Node root,ArrayList<Integer> res){
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr != null){
            if(isLeaf(curr) == false){
                res.add(curr.data);
            }
            if(curr.right != null){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
    public static void leaf(Node root,ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left != null){
            leaf(root.left, res);
        }
        if(root.right != null){
            leaf(root.right, res);
        }
    }
    public static ArrayList<Integer> boundary(Node node){
        ArrayList<Integer> ans=new ArrayList<>();
	    if(node == null){
	        return ans;
	    }
	    if (!isLeaf(node)) {
            ans.add(node.data);
        }
        left(node, ans);
        leaf(node, ans);
        right(node, ans);

        return ans;
    }
    public static void main(String args[]){
        tut16 tree=new tut16();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.root.left.right.left=new Node(8);
        tree.root.left.right.right=new Node(9);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(boundary(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
