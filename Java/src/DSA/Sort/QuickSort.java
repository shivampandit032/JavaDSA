package DSA.Sort;
/*
This is a Another type of " Divide & Conquer Sorting Algorithm " .
Time complexity of the Algorithm is : O(N*N) and Space complexity : O(1) .
 */
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        quick(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr , int low , int high){
        if(low >= high){
            return ;
        }

        int pivot = (low+high)/2;

        int s = low ;

        int e = high;

        while( s <= e){

            while(arr[s] < arr[pivot]){
                s++;
            }
            while(arr[e] > arr[pivot]){
                e--;
            }

            if(s <= e){
                int temp = arr[s];

                arr[s] = arr[e];

                arr[e] = temp ;

                s++;
                e--;
            }
        }

        quick(arr , low , pivot);
        quick(arr , pivot+1, high);
    }
}
