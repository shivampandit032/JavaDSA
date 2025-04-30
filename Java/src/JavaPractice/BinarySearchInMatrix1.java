package JavaPractice;

import java.util.Scanner ;

// Binary Search Algorithm in Matrix . Time Complexity is : O(log row * col) and Space Complexity : O(1) .

public class BinarySearchInMatrix1 {

    public static void main(String[] args){

        int[][] matrix = {
                {10 , 20 , 30 ,40},
                {12 , 22 , 32 , 42 },
                {15, 25 ,35 , 45},
                {18 , 28 , 38 , 48}
        };

        int[][] result = binarySearch(matrix);

        if(result[0][0] == -1 && result[1][0] == -1){
            System.out.println("Element that you are Searching isn't present !");
        }
        else{
            System.out.println("Row index of the elment that you are searching is : "+result[0][0]+" Column index of the element is : "+result[1][0]);
        }
    }
    public static int[][] binarySearch(int[][] matrix){

        System.out.print("Enter the element that you want to search : ");

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int r = 0 ;

        int c = matrix[0].length-1;

        while( r < matrix.length && c >= 0){
            if(target < matrix[r][c]){
                c--;
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else{
                int[][] result = {
                        {r},
                        {c}
                };

                return result ;
            }
        }

        int[][] res = {
                {-1},
                {-1}
        };

        return res ;
    }
}
