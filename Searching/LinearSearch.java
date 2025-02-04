package Searching;
import java.util.Scanner;
// Linear search Algorithm , time complexity of the algorithm is : O(n) , Space complexity : O(1)
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elment you want to search : ");
        int target = sc.nextInt();

        int index = linear(arr , target);

        if(index == -1){
            System.out.println("Element not found !");
        }
        else{

            System.out.println("The index of the target element is : "+index);
        }
    }
    public static int linear(int[] arr , int target){

        for(int i=0;i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}