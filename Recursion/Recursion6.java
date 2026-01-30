//target index
public class Recursion6 {
    public static int targetidx(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
            
        } 
         return targetidx(arr,key,i+1);
    }

    public static void main(String args){
        int arr[]={1,2,3,4,5,8,6};
        System.out.println(targetidx(arr,5,0));
    }
}
