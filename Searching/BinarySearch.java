package Searching;
import java.util.Scanner;
// Time complexity of the binary Search algorithm is : O(log N) , space complexity : O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to search : ");

        int target = sc.nextInt();

        int index = binary(arr , target);
        if(index == -1){
            System.out.println("Element Not found !");
        }
        else{
            System.out.println("Index of the target element is : "+ index);
        }
    }
    public static int binary(int[] arr , int target){

        int s = 0 ;

        int e = arr.length;

        while(s <= e){

            int mid = s + (e-s) /2 ;

            if(target < arr[mid]){
                e = mid - 1;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
            else {
                return mid ;
            }
        }
        return -1;
    }
}
