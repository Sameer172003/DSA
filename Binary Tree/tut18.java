// Count Number of Nodes in a Binary Tree

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut18 {
    static Node root;
    tut18(){
        root=null;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int l=count(root.left);
        int r=count(root.right);
        return (l+r)+1;
    }
    public static void main(String args[]){
        tut18 tree=new tut18();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        System.out.println(count(root));
    }
}
