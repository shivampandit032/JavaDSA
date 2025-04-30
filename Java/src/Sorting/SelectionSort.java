package Sorting;

import java.util.Arrays;

// Time complexity of the algorithm is : O(N*N) . Space Complexity : O(1)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,-111,-99,0,3,2,1};

        sort(arr);

        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int max = 0;
            for(int j=0; j < n-i;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }

            int temp = arr[n-i-1];

            arr[n-i-1] = arr[max];

            arr[max] = temp ;
        }
    }
}
