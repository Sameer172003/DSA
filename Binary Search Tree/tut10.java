// Delete a node from BST

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
    public static int max(Node root){
        if(root.right != null){
           return max(root.right);
        }
        return root.data;
    }
    public static Node delete(Node root,int key){
        if(root == null){
            return null;
        }
        if(root.data < key){
            root.right=delete(root.right, key);
        }
        else if(root.data > key){
            root.left=delete(root.left, key);
        }
        else{
            if(root.right != null && root.left != null){
                int lmax=max(root.left);
                root.data=lmax;
                root.left=delete(root.left, lmax);
                return root;
            }
            else if(root.right != null){
                return root.right;
            }
            else if(root.left != null){
                return root.left;
            }
            else{
                return null;
            }
        }
        return root;
    }
    public static void main(String args[]){
        tut10 tree=new tut10();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);

        int key=14;
        Node ans=delete(root, key);
    }
}
