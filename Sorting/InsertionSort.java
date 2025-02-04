package Sorting;

import java.util.Arrays;

// Time complexity : O(N*N) and Space complexity of the Algorithm : O(1) .
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1,0,-111,-99,-121};

        sort(arr);

        System.out.print(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){

            int element = i;

            for(int j=i-1; j>=0 ; j--){

                if(arr[element] < arr[j]){

                    int temp = arr[element];

                    arr[element] = arr[j];

                    arr[j] = temp ;

                    element = j;
                }
            }
        }
    }
}
