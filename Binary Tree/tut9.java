// Diameter of a Binary Tree

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
    public static int height(Node root,int maxi[]){
        if(root == null){
            return 0;
        }
        int l=height(root.left, maxi);
        int r=height(root.right, maxi);

        maxi[0]=Math.max(maxi[0],l+r);
        return 1+Math.max(l,r);
    }
    public static int diameter(Node root){
        int maxi[]=new int[1];
        height(root, maxi);
        return maxi[0];
    }
    public static void main(String args[]){
        tut9 tree=new tut9();

        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        System.out.println(diameter(root));
    }
}
