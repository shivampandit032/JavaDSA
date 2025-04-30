package Recursion;
import java.util.Scanner;
import java.util.Arrays;


public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target element : ");

        int target = sc.nextInt();

        int index = binary(arr ,0 , arr.length-1, target);

        if(index == -1){
            System.out.println("Element not found !");
        }
        else{
            System.out.println("Index of the target element is : "+index);
        }
    }
    public static int binary(int[] arr , int s , int e , int target){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(target < arr[mid]){
            return binary(arr , s , mid-1, target);
        }
        if(target > arr[mid]){
            return binary(arr , mid+1, e , target);
        }
        return mid ;
    }
}
