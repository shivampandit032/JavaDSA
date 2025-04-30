package Backtracking;

public class Solution {

        public void solveSudoku(char[][] board) {

        }
        public static void solver(char[][] board , int r , int n , int[] visited){

            if(r >= n){
                return ;
            }

            for(int c= 0 ; c<n;c++){

                if(board[r][c] == '.'){

                    if(isSafe(board , r , c , n)){

                    }
                }
                else{

                    int val = (int) board[r][c] ;

                    visited[val] = 1;


                }
            }
        }

        public static boolean isSafe(char[][] board , int r , int c , int n){
            return false ;
        }

    public static void main(String[] args) {

    }
}
