package Queue;
import java.util.*;
public class QueueSt {
    static class Stack{
        Deque<Integer>d=new LinkedList<>();

        public void push(int data){
             d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
         public int peek(){
            return d.getLast();
        }
          public boolean isEmpty() {
            return d.isEmpty();
        }

    }   
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek"+s.peek());
        while (!s.isEmpty()) { 
            System.out.println(s.peek());
            s.pop();
     }
    }
}
