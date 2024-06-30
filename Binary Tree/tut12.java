// Right view of Binary Tree 

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut12 {
    static Node root;
    tut12(){
        root=null;
    }
    public static void helper(Node root,int level,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            ans.add(root.data);
        }
        helper(root.right,level+1,ans);
        helper(root.left,level+1,ans);
    }
    public static ArrayList<Integer> rightView(Node root)
    {
      ArrayList<Integer> ans=new ArrayList<>();
      int level=0;
      helper(root,level,ans);
      return ans;
    }
    public static void main(String args[]){
        tut12 tree=new tut12();
        tree.root=new Node(1);
        tree.root.left=new Node(3);
        tree.root.right=new Node(2);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(rightView(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
