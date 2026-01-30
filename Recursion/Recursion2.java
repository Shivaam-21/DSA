// #factorial
public class Recursion2 {
    public static int printFac(int n){
        if(n==1){
            System.out.println(n);
            return 1 ;
        }
        return n*(n-1);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(printFac(n));
    }
}
