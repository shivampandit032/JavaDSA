package SampleCodes;
import java.util.Scanner ;
// Binary Search in Matrix , Pattern 1 . TC : O(log mn) . SC : O(1) .
public class BSInMatrix1 {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("Enter the target element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[][] result = bsMat(matrix , target);

        if(result[0][0] == -1 && result[1][0] == -1){
            System.out.println("Element NOt found !");
        }
        else{
            System.out.println("row index of the target element is : "+result[0][0] + " column index of the target element is : "+result[1][0]);

        }
    }
    public static int[][] bsMat(int[][] mat , int target){

        int row = 0 ;
        int col = mat[0].length-1;

        while(row < mat.length && col >= 0 ){
            if(target > mat[row][col] ){
                row++;
            }
            else if(target < mat[row][col]){
                col--;
            }
            else{
                int[][] result = {
                        {row},
                        {col}
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
