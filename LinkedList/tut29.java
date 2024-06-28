// Flattening a Linked List

class Node{
    int data;
    Node next;
    Node bottom;
    Node(int data){
        this.data=data;
        this.next=null;
        this.bottom=null;
    }
}
public class tut29 {
    public static Node merge(Node list1,Node list2){
        Node dummyNode = new Node(0);
        Node res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.bottom = list1;
                res = res.bottom;
                list1 = list1.bottom;
            } else {
                res.bottom = list2;
                res = res.bottom;
                list2 = list2.bottom;
            }
            res.next = null;
        }
        if (list1 != null) {
            res.bottom = list1;
        } else {
            res.bottom = list2;
        }
        if (dummyNode.bottom != null) {
            dummyNode.bottom.next = null;
        }

        return dummyNode.bottom;
    }
    public static Node flatten(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mergeHead=flatten(head.next);
        return merge(head, mergeHead);
    }
    public static void main(String args[]){

    }
}
