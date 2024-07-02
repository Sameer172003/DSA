// Morris Traversal (Preorder Traversal)

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
public class tut26{
    static Node root;
    tut26(){
        root=null;
    }
    public static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        while(root != null){
            if(root.left == null){
                ans.add(root.data);
                root=root.right;
            }
            else{
                Node curr=root.left;
                while(curr.right != null && curr.right != root){
                    curr=curr.right;
                }
                if(curr.right == null){
                    ans.add(root.data);
                    curr.right=root;
                    root=root.left;
                }
                else{
                    curr.right=null;
                    root=root.right;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        tut26 tree=new tut26();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(preorder(root));

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
