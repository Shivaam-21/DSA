package HashMap;
import java.util.*;
public class Hashmap {
    public static void main(String args[]){
        HashMap<String ,Integer>h=new HashMap<>();
//Insert
        h.put("Shivam",21);
        h.put("Manish",20);
        h.put("Bhola",24);
        System.out.println(h);

        h.put("Bhola",25);
        System.out.println(h);

        //search
        if(h.containsKey("Shivam")){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        System.out.println(h.get("Shivam"));

        System.out.println();


        for(Map.Entry<String,Integer> e :h.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
