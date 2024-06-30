// Determine if Two Trees are Identical

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut7 {
    static Node root1,root2;
    tut7() {
        root1 = root2 = null;
    }
    public static boolean isIdentical(Node root1,Node root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data) && isIdentical(root1.left, root2.left) 
        && isIdentical(root1.right, root2.right);
    }
    public static void main(String args[]){
        tut7 tree=new tut7();

        tree.root1=new Node(1);
        tree.root1.left=new Node(2);
        tree.root1.right=new Node(3);

        tree.root2=new Node(1);
        tree.root2.left=new Node(2);
        tree.root2.right=new Node(4);

        System.out.println(isIdentical(root1, root2));
    }
}
