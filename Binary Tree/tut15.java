// ZigZag Tree Traversal

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
public class tut15 {
    static Node root;
    tut15(){
        root=null;
    }
    public static ArrayList<Integer> zigzag(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
	    Queue<Node> sc=new LinkedList<>();
	    sc.add(root);
	    if(root == null){
	        return ans;
	    }
	    boolean flag=true;

        while(!sc.isEmpty()){
            int level=sc.size();
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=0;i<level;i++){
                Node temp=sc.peek();
                sc.remove();

                if(temp.left != null){
                    sc.offer(temp.left);
                }
                if(temp.right != null){
                    sc.offer(temp.right);
                }
                if (flag == true){
                    res.add(temp.data);
                }
                else{
                    res.add(0,temp.data);
                }
            }
            flag=!flag;
            ans.addAll(res);
        }
        return ans;
    }
    public static void main(String args[]){
        tut15 tree=new tut15();
        tree.root=new Node(1);
        tree.root.left=new Node(3);
        tree.root.right=new Node(2);

        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(zigzag(root));
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
