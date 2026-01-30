package ArrayList;
import java.util.*;
public class Arraylistlonely {
    public static void main(String args[]){
       ArrayList<Integer> l=new ArrayList<>(); 
       l.add(1);
       l.add(100);
       l.add(200);
       l.add(1);
       l.add(100);

       int target=100;
        int count=0;
       for(int i=0;i<l.size();i++){
        if(l.get(i)==target){
            count++;
            System.out.println("Target number is "+l.get(i));
        }
       
    }
     System.out.println("total occurance is:"+count);
    }
}
