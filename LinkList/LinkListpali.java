package LinkList;
import java.util.*;
public class LinkListpali {
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
    public static int size;
      public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;  
    }
    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

       
// check palindrome
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;  //this is my mid

    }

public boolean checkPalindrome(){
    if(head==null || head.next ==null){
        return true;
    }
// step 1: find mid
Node midNode=findMid(head);

// step 2: reverse 2nd half
Node prev=null;
Node curr=midNode;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
Node right=prev;
Node left=head;

// step 3: check left half & right half
    while(right !=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;

    }
    return true;
}

      public static void main(String[] args) {
        LinkListpali ll = new LinkListpali();  
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

      System.out.println(ll.checkPalindrome());
      }
}
