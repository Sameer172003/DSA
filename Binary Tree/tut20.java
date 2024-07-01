// Lowest common Ancestor of Binary Tree

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut20 {
    static Node root;
    tut20(){
        root=null;
    }
    public static Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root == null || root.data == n1 || root.data == n2){
		    return root;
		}
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		
		if(left == null){
		    return right;
		}
		else if(right == null){
		    return left;
		}
		else{
		    return root;
		}
	}
    public static void main(String args[]){
        tut20 tree=new tut20();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        int n1=2;
        int n2=3;

        Node ans=lca(root, n1, n2);
        System.out.println(ans.data);
    }
}
