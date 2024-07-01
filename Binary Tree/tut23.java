// Binary Tree from Inorder and Postorder


class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut23{
    public static int find(int in[],int ele,int n){
        for(int i=0;i<n;i++){
            if(in[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public static Node solve(int in[],int post[],int idx[],int inS,int inE,int n){
        if(idx[0] < 0 || inS > inE){
            return null;
        }
        int ele=post[idx[0]--];
        Node root=new Node(ele);
        int pos=find(in,ele,n);

        root.right=solve(in, post, idx, pos+1, inE, n);
        root.left=solve(in, post, idx, inS, pos-1, n);

        return root;
    }
    public static Node Binarytree(int in[],int post[],int n){
        int idx[]={n-1};
        return solve(in,post,idx,0,n-1,n);
    }
    public static void main(String args[]){
        
    }
}
