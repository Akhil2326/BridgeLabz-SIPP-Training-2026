class Node{
    int val;
    Node next;
    Node(int val){this.val=val;}
}

public class Scenario3_Reverse{
    static Node reverse(Node head){
        Node prev=null,curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
