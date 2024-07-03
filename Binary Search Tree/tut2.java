// Minimum / Maximum element in BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut2 {
    static Node root;
    tut2(){
        root=null;
    }
    // public static int min(Node root){
    //     while(root.left != null){
    //         return min(root.left);
    //     }
    //     return root.data;
    // }
    public static int max(Node root){
        while(root.right != null){
            return max(root.right);
        }
        return root.data;
    }
    public static void main(String args[]){
        tut2 tree=new tut2();
        tree.root=new Node(5);
        tree.root.left=new Node(4);
        tree.root.right=new Node(6);
        tree.root.left.left=new Node(3);
        tree.root.right.right=new Node(7);
        tree.root.left.left.left=new Node(1);

        // System.out.println(min(root));
        
        System.out.println(max(root));
    }
}
