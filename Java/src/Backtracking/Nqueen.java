package Backtracking;
import java.util.ArrayList;

public class Nqueen {
    public static void main(String[] args) {
        int n = 4 ;
        int[][] board = new int[n][n];

        ArrayList<int[][]> result = new ArrayList<>();

        nqueen(board , 0 , n , result);
    }
    public static void nqueen(int[][] board , int r , int n , ArrayList<int[][]> result){
        if(r >= n){
            result.add(board);
            display(board , n);
            System.out.println();
            return ;
        }
        for(int c = 0 ; c < n; c++){
            if(isSafe(board , r , c , n )){
                board[r][c] = 1;

                nqueen(board , r+1 , n , result);

                board[r][c] = 0 ;
            }
        }
    }
    public static boolean isSafe(int[][] board , int r , int c , int n){
        // Upper Row
        for(int i=r-1;i>=0;i--){
            if(board[i][c] == 1){
                return false;
            }
        }

        for(int lR = r-1 , lC = c-1 ; lR >= 0 && lC >=0 ; lR-- , lC--){
            if(board[lR][lC] == 1){
                return false;
            }
        }

        for(int rR = r-1 , rC = c+1 ; rR >=0 && rC <= n-1 ; rR-- , rC++){
            if(board[rR][rC] == 1){
                return false ;
            }
        }

        return true ;
    }
    public static void display(int[][] board ,int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(board[i][j] == 1){
                    System.out.print(" Q ");
                }
                else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}
