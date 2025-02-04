package Sorting;

import java.util.Arrays;

// It is a Special type of sorting algorithm to sort a " sequence of element in a array like in 1 to n " .
// Time complexity : O(N) and Space complexity : O(1)
public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        sort(arr);

        System.out.print(Arrays.toString(arr));
    }

    public static void sort(int[] arr){

        int n = arr.length;

        for(int i=0 ; i<n ;i++){

            int correctIndex = arr[i]-1;

            if(arr[correctIndex] != arr[i]){
                int temp = arr[i];

                arr[i] = arr[correctIndex];

                arr[correctIndex] = temp;
            }
        }
    }
}
