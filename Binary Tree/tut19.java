// Check for Children Sum Property in a Binary Tree

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut19 {
    static boolean flag;
    static Node root;
    tut19(){
        root=null;
    }
    public static int check(Node root){
        flag=true;
        helper(root);
        return flag?1:0;
    }
    public static int helper(Node root){
        if(root == null)
        return 0;
        
        if(root.left == null && root.right == null)
        return root.data;
        
        int left=0, right=0;
        left = helper(root.left);
        right = helper(root.right);
        
        if(left+right != root.data)
        flag = false;
        
        return left+right;
    }
    public static void main(String args[]){
        tut19 tree=new tut19();
        tree.root=new Node(35);
        tree.root.left=new Node(20);
        tree.root.right=new Node(10);

        System.out.println(check(root));
    }
}
