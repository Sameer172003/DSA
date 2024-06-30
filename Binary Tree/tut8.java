// Symmetric Tree

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
    public static boolean helper(Node root1,Node root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data) && helper(root1.left, root2.left) 
        && helper(root1.right, root2.right);
    }
    public static boolean isSymmetric(Node root){
        if(root == null){
            return true;
        }
        return helper(root.left, root.right);
    }
    public static void main(String args[]){
        tut8 tree=new tut8();

        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(2);
        
        System.out.println(isSymmetric(root));
    }
}
