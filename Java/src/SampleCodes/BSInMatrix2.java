package SampleCodes;
import java.util.Scanner ;
// BS in Matrix , Pattern 2 . TC: O(nlog m) and SC : O(1) .
public class BSInMatrix2 {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.print("Eneter the element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[][] result = bsMat(matrix ,target);

        if(result[0][0] == -1 && result[1][0] == -1){
            System.out.println("Element Not Found!");
        }
        else{
            System.out.println("row index of the target elment is : "+result[0][0] + " column index of the target elment is : "+result[1][0]);
        }
    }
    public static int[][] bsMat(int[][] matrix , int target){

        int row = matrix.length;
        int col = matrix[0].length;

        int s = 0 ;
        int e = row * col - 1;
        while(s <= e){
            int mid = s + (e - s)/2;

            int rI = mid / col ;
            int cI = mid % col ;

            if(matrix[rI][cI] < target ){
                s = mid + 1;
            }
            else if(matrix[rI][cI] > target){
                e = mid -1 ;
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
        }    ;
        return result;
    }

}
