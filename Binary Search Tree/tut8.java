// Check for BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut8 {
    static Node root;
    tut8(){
        root=null;
    }
    public static boolean isValidBST(Node root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.data >= maxVal || root.data <= minVal) return false;
        
        return isValidBST(root.left, minVal, root.data) && isValidBST(root.right,root.data, maxVal);
    }
    public static boolean isBST(Node root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String args[]){
        tut8 tree=new tut8();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);
        tree.root.right.right=new Node(5);

        System.out.println(isBST(root));
    }
}
