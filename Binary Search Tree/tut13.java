// Construct Binary Search Tree from Preorder Traversal


class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut13 {
    static Node root;
    tut13(){
        root=null;
    }
    public  static Node helper(int pre[],int s,int e){
        if(s > e){
            return null;
        }
        Node root=new Node(pre[s]);
        int i;
        for(i=s;i<=e;i++){
            if(pre[i] > root.data){
                break;
            }
        }
        root.left=helper(pre,s+1,i-1);
        root.right=helper(pre,i,e);
        return root;
    }
    public static Node preorder(int pre[]){
        return helper(pre,0,pre.length-1);
    }
    public static void main(String args[]){
        int pre[]={8,5,1,7,10,12};

    }
}
