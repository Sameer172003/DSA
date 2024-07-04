// Find a pair with given target in BST

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
    public static void tree(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        tree(root.left,ans);
        ans.add(root.data);
        tree(root.right,ans);
    }
    public static int isPairPresent(Node root, int target)
    {
        // Write your code here
        ArrayList<Integer> ans=new ArrayList<>();
        tree(root,ans);
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            int sum=ans.get(i)+ans.get(j);
            if(sum == target){
                return 1;
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        tut12 tree=new tut12();

        tree.root=new Node(2);
        tree.root.left=new Node(1);
        tree.root.right=new Node(3);
        int sum=5;
        
        System.out.println(isPairPresent(root, sum));
    }
}
