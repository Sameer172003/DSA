// Fixing Two swapped nodes of a BST / Recover a BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut14 {
    static Node root;
    tut14(){
        root=null;
    }
    static Node first=null,second=null,prev=null;
    public static void helper(Node root){
        if(root == null){
            return;
        }
        helper(root.left);
        if(prev != null && prev.data > root.data){
            if(first == null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        helper(root.right);

    }
    public static Node recover(Node root){
        first=null; second=null; prev=null;
        helper(root);
        if(first==null || second==null) return root;
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        
        return root;
    }
    public static void main(String args[]){
        tut14 tree=new tut14();

        tree.root=new Node(10);
        tree.root.left=new Node(5);
        tree.root.right=new Node(8);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(20);

        // Node ans=recover(root);

        System.out.println(recover(root).data);
    }
}
