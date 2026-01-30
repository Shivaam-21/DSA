package ArrayList;
import java.util.*;
public class Arraylistque {
   public static boolean isMonotonic(ArrayList<Integer> nums){
    // boolean increasing=true;
    // boolean decreasing=false;
    for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)<=nums.get(i+1)){
            return true;
        }
        else{
            return false;
        }
    }
    return false;
   }

   public static void main(String args[]){
    ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,2,3));
    System.out.println(isMonotonic(nums));
   }     
}
