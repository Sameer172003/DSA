// Floor in BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.left=null;
        this.right=null;
    }
}
public class tut4 {
    static Node root;
    tut4(){
        root=null;
    }
    public static int floor(Node root, int x) {
        // Code here
        if (root == null) return -1;
        // Code here
        int floor=-1;
        while(root != null){
            if(root.data == x){
                floor=root.data;
                return floor;
            }
            if(x > root.data){
                floor=root.data;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return floor;
    }
    public static void main(String args[]){
        tut4 tree=new tut4();

        tree.root=new Node(6);
        tree.root.right=new Node(8);
        tree.root.right.left=new Node(7);
        tree.root.right.right=new Node(9);

        int key=11;

        System.out.println(floor(root, key));
    }
}
