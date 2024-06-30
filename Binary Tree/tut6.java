// Balanced Tree Check

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut6 {
    static Node root;
    tut6() {
        root = null;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        if(l == -1) return -1;
        int r=height(root.right);
        if(r == -1) return -1;

        if(Math.abs(l-r)>1) return -1;

        return 1+Math.max(l,r);
    }
    public static boolean isBalanced(Node root){
        return height(root) != -1;
    }
    public static void main(String args[]){
        tut6 tree=new tut6();
        tree.root = new Node(1);
        tree.root.left=new Node(2);
        tree.root.left.right=new Node(3);

        System.out.println(isBalanced(root));
    }
}
