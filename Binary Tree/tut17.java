// Root to Leaf Paths

import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class tut17 {
    static Node root;
    tut17(){
        root=null;
    }
    public static void helper(Node root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(root ==  null){
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(list));
        }
        else{
            helper(root.left, list, ans);
            helper(root.right, list, ans);
        }
        list.remove(list.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> allPaths(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        helper(root, list, ans);
        return ans;
    }
    public static void main(String args[]){
        tut17 tree=new tut17();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans.addAll(allPaths(root));

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
