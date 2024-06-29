// Find pairs with given sum in doubly linked list

import java.util.ArrayList;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
public class tut39 {
    public static Node display(Node head){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return head;
    }
    public static Node convert(int arr[]){
        Node head=new Node(arr[0],null,null);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=prev.next;
        }
        return head;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<ArrayList<Integer>> ();
        Node s=head;
        Node e = head;
        while(e.next != null)
        {
            e=e.next;
        }
        while(s.data < e.data)
        {
            int sum=s.data + e.data;
            if(sum == target)
            {
                ArrayList<Integer> total = new ArrayList<Integer>();
                total.add(s.data);
                total.add(e.data);
                ans.add(total);
                s=s.next;
                e=e.prev;
            }
            else if(sum < target)
            {
                s=s.next;
            }
            else if(sum> target)
            {
                e=e.prev;
            }
        }       
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,6,8,9};
        Node head=convert(arr);
        int target=7;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans.addAll(findPairsWithGivenSum(target, head));
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
