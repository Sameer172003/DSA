// Morris Traversal (Inorder Traversal)

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
public class tut25 {
    static Node root;
    tut25(){
        root=null;
    }
    public static ArrayList<Integer> inorder(Node root){
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
                    curr.right=root;
                    root=root.left;
                }
                else{
                    curr.right=null;
                    ans.add(root.data);
                    root=root.right;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        tut25 tree=new tut25();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(inorder(root));

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
