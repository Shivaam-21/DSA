//tiling
public class Recursion9 {
    public static int tilingProblem(int n){

        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int vt=tilingProblem(n-1);

        //horizontal
        int vt2=tilingProblem(n-2);

        int total=vt+vt2;
        return total;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(3));
    }
}
