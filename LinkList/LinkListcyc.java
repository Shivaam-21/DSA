package LinkList;
import java.util.*;
public class LinkListcyc {
        public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static  boolean isCyc(){
        Node slow=head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

public void removecyc(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if( slow==fast){
                Node entry=head;

                if (slow == head) {
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                    fast.next = null;
                    return;
                } else {
                    while (entry.next != slow.next) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    slow.next = null;
                    return;
                }
            }
        }
    }
  public static void main(String args[]) {
      LinkListcyc list = new  LinkListcyc();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = list.head; // Create cycle

        System.out.println("Before removing cycle: " + list.isCyc());

        list.removecyc();

        System.out.println("After removing cycle: " + list.isCyc());
    }
}
