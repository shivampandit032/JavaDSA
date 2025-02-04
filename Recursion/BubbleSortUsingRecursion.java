package Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1, -111, -12,-99,0};

        int n = arr.length;

        sort(arr , 0 , n);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr , int i , int n){
        if(i > n-1){
            return ;
        }

        sort2(arr , i , 1 , n);

        sort(arr , i+1, n);

    }
    public static void sort2(int[] arr ,int i , int j , int n){
        if(j > n-i-1){
            return ;
        }

        if(arr[j] < arr[j-1]){
            int temp = arr[j];

            arr[j] = arr[j-1];

            arr[j-1] = temp ;
        }

        sort2(arr , i , j+1 , n);
    }
}
