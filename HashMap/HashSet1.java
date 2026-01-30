package HashMap;
import java.util.*;
public class HashSet1 {
    public static void main(String [] args) {
        HashSet<Integer>s =new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        if(s.contains(1)){
            System.out.println("True"); 
        }
        s.remove(3);
       if(!s.contains(3)){
            System.out.println("False");
       }

       Iterator it=s.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
    }
}
