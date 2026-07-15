class Node{
    int val;
    Node next;
    Node(int val){this.val=val;}
}

public class Scenario4_FindMiddle{
    static Node findMiddle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
