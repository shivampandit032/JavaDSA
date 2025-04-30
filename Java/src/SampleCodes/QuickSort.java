package SampleCodes;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        quick(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr ,int i , int j){

        if(i >= j){
            return ;
        }

        int low = i;
        int high = j;

        int mid = (i + j)/2;

        int pivot = arr[mid];

        while(low <= high){

            if(arr[low] < pivot){
                low++;
            }
            else if(arr[high] > pivot){
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
        quick(arr,i , high);
        quick(arr,low , j);

    }
}
