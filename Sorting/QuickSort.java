package Sorting;
import java.util.*;

// This is one of the Optimised Sorting Algorithm , Code is taken from " Kunal kushwaha "

// Time complexity of the Algorithm : O(N*N)  and Space complexity : O(1) .
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-111,-11123,-12,-999,-9,0};

        quick(arr , 0 , arr.length-1);

        System.out.print(Arrays.toString(arr));
    }
    public static void quick(int[] arr , int s , int e){
        if(s >= e){
            return ;
        }

        int low = s;
        int high = e;

        int mid = (s+e) / 2;

        int pivot = arr[mid];

        while(low <= high){

            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        quick(arr , s , high);
        quick(arr , low , e);
    }
}
