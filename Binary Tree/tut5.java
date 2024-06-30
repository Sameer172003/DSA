// Height of Binary Tree

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut5 {
    static Node root;

    tut5() {
        root = null;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);

        return 1+Math.max(l,r);
    }
    public static void main(String args[]){
        tut5 tree=new tut5();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println(height(root));
    }
}
