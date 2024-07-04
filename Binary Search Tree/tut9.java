// Insert a node in a BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut9 {
    static Node root;
    tut9(){
        root=null;
    }
    public static Node insert(Node root,int key){
        if(root == null){
            return new Node(key);
        }
        if(root.data < key){
            root.right=insert(root.right, key);
        }
        else if(root.data > key){
            root.left=insert(root.left, key);
        }
        else{
            // Nothing to do
        }
        return root;
    }
    public static void main(String args[]){
        tut9 tree=new tut9();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);

        int key=4;

        Node ans=insert(root, key);
        
    }
}
