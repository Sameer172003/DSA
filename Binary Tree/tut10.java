// Maximum path sum from any node

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut10 {
    static Node root;
    tut10(){
        root=null;
    }
    public static int height(Node root,int maxi[]){
        if(root == null){
            return 0;
        }
        int l=Math.max(0,height(root.left, maxi));
        int r=Math.max(0,height(root.right, maxi));

        maxi[0]=Math.max(maxi[0],root.data+l+r);
        return root.data+Math.max(l,r);
    }
    public static int maximumPath(Node root){
        int maxi[]=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        height(root, maxi);
        return maxi[0];
    }
    public static void main(String args[]){
        tut10 tree=new tut10();

        tree.root=new Node(10);
        tree.root.left=new Node(2);
        tree.root.right=new Node(5);
        tree.root.right.right=new Node(-2);

        System.out.println(maximumPath(root));
    }
}
