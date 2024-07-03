// LCA of BST

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut7 {
    static Node root;
    tut7(){
        root=null;
    }
    public static Node LCA(Node root, int n1, int n2)
	{
        // code here.  
        if(root == null){
            return null;
        }
        int curr=root.data;
        if(curr < n1 && curr < n2){
            return LCA(root.right,n1,n2);
        }
        if(curr > n1 && curr > n2){
            return LCA(root.left,n1,n2);
        }
        return root;
    }
    public static void main(String args[]){
        tut7 tree=new tut7();
        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);

        int n1=1;
        int n2=3;

        Node ans=LCA(root, n1, n2);
        System.out.println(ans.data);
    }
}
