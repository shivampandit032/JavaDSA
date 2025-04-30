package DSA.SearchingAlgo;
import java.util.Scanner ;
public class Linear {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};

        int index = linear(arr);

        if(index == -1){
            System.out.println("Element Not found !");
        }
        else{
            System.out.println("index of the target element is : "+index);
        }
    }
    public static int linear(int[] arr){
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element : ");
        byte target = sc.nextByte();
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i ;
            }
        }

        return -1;
    }
}
