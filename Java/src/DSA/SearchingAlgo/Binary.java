package DSA.SearchingAlgo;
import java.util.Scanner ;
public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int index =binary(arr);

        if(index == -1){
            System.out.println("Element Not found !");
        }
        else{
            System.out.println("index of the elment is : "+index);
        }
    }
    public static int binary(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");
        byte target = sc.nextByte();
        int n = arr.length;

        int s = 0 ;

        int e = n-1;

        while(s <= e){
            int mid = s + (e -s )/2 ;

            if(arr[mid] < target ){
                s = mid + 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
