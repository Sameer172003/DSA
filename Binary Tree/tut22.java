// Construct Tree from Inorder & Preorder

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut22 {
    public static int find(int in[],int ele,int n){
        for(int i=0;i<n;i++){
            if(in[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public static Node solve(int in[],int pre[],int idx[],int inS,int inE,int n){
        if(idx[0] >= n || inS > inE){
            return null;
        }
        int ele=pre[idx[0]++];
        Node root=new Node(ele);
        int pos=find(in,ele,n);

        root.left=solve(in, pre, idx, inS, pos-1, n);
        root.right=solve(in, pre, idx, pos+1, inE, n);

        return root;
    }
    public static Node Binarytree(int in[],int pre[],int n){
        int idx[]={0};
        return solve(in,pre,idx,0,n-1,n);
    }
    public static void main(String args[]){
        
    }
}
