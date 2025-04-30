package JavaPractice;

import java.util.Scanner ;

// Binary Search Algorithm in Matrix (when rowwise and columnwise Matrix is Sorted ) . Time complexity : O(log row*col).
// Space complexity : O(1) .
public class BinarySearchInMatrix2 {

    public static void main(String[] args){

        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int[][] result = binarySearch(matrix);

        if(result[0][0] == -1 && result[1][0] == -1){
            System.out.println("Element that you are searching isn't present !");
        }
        else{
            System.out.println("Row index of the target elment is : "+result[0][0]+" column index of the target element is :"+result[1][0]);
        }
    }
    public static int[][] binarySearch(int[][] matrix){

        System.out.print("Enter the element that you want to search : ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int row = matrix.length;

        int col = matrix[0].length;

        int s = 0 ;

        int e = (row*col) - 1;

        while( s <= e){

            int mid = s + (e - s)/2 ;

            int rI = mid/col ;
            int cI = mid%col ;

            if(number < matrix[rI][cI]){
                e = mid-1;
            }
            else if(number > matrix[rI][cI]){
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

        return result ;
    }
}
