// Predecessor and Successor

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut11 {
    static Node root;
    tut11(){
        root=null;
    }
    public static Node findPre(Node root, int key){
        Node pre = null;
        while(root!=null){
            if(root.data>=key) root = root.left;
            else{
                pre = root;
                root = root.right;
            }
        }
        return pre;
    }
    public static Node findSuc(Node root, int key){
        Node suc = null;
        while(root!=null){
            if(root.data<=key) root = root.right;
            else{
                suc = root;
                root = root.left;
            }
        }
        return suc;
    }
    public static void find(Node root, Node[] pre, Node[] suc, int key){
        pre[0] = findPre(root, key);
        suc[0] = findSuc(root, key);
    }
    public static void main(String args[]){
        tut11 tree=new tut11();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);

        int key=14;
        
    }
}
