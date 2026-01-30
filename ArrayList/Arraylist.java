package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get operation

        int ele=list.get(2);
        System.out.println(ele);

        //remove operation
        int re=list.remove(3);
        System.out.println(re);
        
        //set element
        int se=list.set(2,10);
        System.out.println(se);

        //contain element
        
        System.out.println(list.contains(12));

         System.out.println(list);
 
    }
    
}
