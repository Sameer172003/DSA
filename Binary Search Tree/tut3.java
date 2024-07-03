// Ceil in BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.left=null;
        this.right=null;
    }
}
public class tut3 {
    static Node root;
    tut3(){
        root=null;
    }
    public static int ceil(Node root,int key){
        if (root == null) return -1;
        // Code here
        int ceil=-1;
        while(root != null){
            if(root.data == key){
                ceil=root.data;
                return ceil;
            }
            if(key > root.data){
                root=root.right;
            }
            else{
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }
    public static void main(String args[]){
        tut3 tree=new tut3();

        tree.root=new Node(5);
        tree.root.left=new Node(1);
        tree.root.right=new Node(7);
        tree.root.left.right=new Node(2);
        tree.root.left.right.right=new Node(3);

        int key=3;

        System.out.println(ceil(root, key));
    }
}
