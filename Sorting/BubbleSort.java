package Sorting;
import java.util.Arrays;
// Bubble Sort algorithm . Time complexity : O(N*N) and Space complexity : O(1) .
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){

            for(int j=1;j<n-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];

                    arr[j] = arr[j-1];

                    arr[j-1] = temp;
                }
            }
        }
    }
}
