package DSA.Recursion;
import java.util.Scanner ;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        int target = sc.nextInt();
        int index = binarySearch(arr , 0 , arr.length-1,target);

        if(index == -1){
            System.out.println("Element Not found!");
        }
        else{
            System.out.println("So the index of the element is : "+index);
        }
    }
    public static int binarySearch(int[] arr , int s , int e,int target){
        if(s >= e){
            return -1;
        }

        int mid = (s + e) /2 ;

        if(target < arr[mid]){
            return binarySearch(arr , s , mid -1 , target);
        }
        else if(target > arr[mid]){
            return binarySearch(arr , mid+1 , e , target);
        }
        else{
            return mid ;
        }
    }
}
