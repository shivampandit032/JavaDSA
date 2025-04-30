package Searching;
import  java.util.Scanner ;

//This is Binary Search in Matrix Pattern 1 by "Kunal kushwaha " . Time complexity : O(log mn) and Space complexity : O(1)

public class BinarySearchInMatrix1 {

    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {12,22,32,42},
                {17,27,37,47},
                {19,29,39,49}
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target element you want to search :  ");

        int target = sc.nextInt();

        int[][] index = binary( arr ,target);

        if(index[0][0] == -1 && index[1][0] == -1){
            System.out.println("Element not found !");
        }
        else{
            System.out.println("Row index of the target elment is : "+index[0][0]+" and column index of the target element is : "+index[1][0]);

        }
    }
    public static int[][] binary(int[][] arr , int target){

        int s = 0 ;
        int e = arr[0].length-1;

        while( s<= arr.length-1 && e >= 0 ){

            if(target < arr[s][e]){
                e--;
            }
            else if(target > arr[s][e]){
                s++;
            }
            else{
                int[][] result = {
                        {s},
                        {e}
                };

                return result;
            }
        }
        int[][] result = {
                {-1},
                {-1}
        };

        return result;
    }
}
