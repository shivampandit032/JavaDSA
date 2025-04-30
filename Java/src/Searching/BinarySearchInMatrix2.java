package Searching;
import java.util.Scanner ;

// Binary Search in Matrix Pattern 2 , By Take U forward .
// Time complexity of the algorithm is : O(log mn) and Space complexity is : O(1)
public class BinarySearchInMatrix2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to search : ");

        int target = sc.nextInt();

        int[][] index = binary(arr , target);

        if(index[0][0] == -1 && index[1][0] == -1){
            System.out.println("Element Not found !");
        }
        else{
            System.out.println("Row index of the target element is : "+index[0][0]+" and column index of the target element is : "+index[1][0]);
        }

    }
    public static int[][] binary(int[][] arr , int target){

        int r = arr.length;
        int c = arr[0].length;

        int s = 0;

        int e = r*c-1;

        while(s <= e){

            int mid = s + (e -s )/2 ;

            int rI = mid / c;

            int cI = mid % c;

            if(target < arr[rI][cI]){
                e = mid - 1;
            }
            else if(target > arr[rI][cI]){
                s = mid + 1;
            }
            else{
                int[][] result = {
                        {rI},
                        {cI}
                };

                return result ;
            }
        }
        int[][] result = {
                {-1},
                {-1}
        };

        return result;
    }
}
