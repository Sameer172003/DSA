// Search in BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class tut1{
    static Node root;
    tut1(){
        root=null;
    }
    // public static Node search(Node root,int x){
    //     if(root == null){
    //         return null;
    //     }
    //     if(root.data == x){
    //         return root;
    //     }
    //     if(root.data > x){
    //         return search(root.left, x);
    //     }
    //     else{
    //         return search(root.right, x);
    //     }
    // }

    public static boolean search(Node root,int x){
        Node cur = root;
        
        while (cur != null) {
            if (cur.data == x) return true;
            else if (cur.data < x) cur = cur.right;
            else cur = cur.left;
        }
        return false;
    }
    public static void main(String args[]){
        tut1 tree=new tut1();
        tree.root=new Node(4);
        tree.root.left=new Node(2);
        tree.root.right=new Node(7);
        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);

        int x=5;

        System.out.println(search(root, x));
    }
}