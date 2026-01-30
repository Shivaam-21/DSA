package LinkList;
import java.util.*;
public class DoubleLL {
    public class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    }
    public static Node head;
    public static Node tail;
    public static Node size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=null;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    public int  removeFirst(int data){
        if(head==null){
           System.err.println("Dll  is empty");
           return -1;
        }
        Node temp=head;
        if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
        return temp.data;
        
        
    }
 public int  removeLast(int data){
        if(head==null){
           System.out.println("Dll  is empty");
           return -1;
        }
        Node temp=tail;
        if(head==tail){
            head=tail=null;
        }else{
          tail= tail.prev;
            tail.next=null;
        }
        return temp.data;
        
        
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
       dll.print();
       dll.removeFirst(1);
       dll.print();
       dll.removeLast(4);
       dll.print();
    }

}
