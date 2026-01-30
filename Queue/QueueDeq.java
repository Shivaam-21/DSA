package Queue;
import java.util.*;
public class QueueDeq {
    public static void main(String args[]){
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        System.out.println(d);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
