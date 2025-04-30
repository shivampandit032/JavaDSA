package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
// This is One of the Optimised Sorting algorithm , code is taken from Take U forward .
// Time complexity of the algorithm is : O(N * log N) and Space Complexity : O(N) .
// This algorithm works in "Divide and Conquer Principle ".
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-111,0,-99};

        merge(arr , 0 , arr.length-1);

        System.out.print(Arrays.toString(arr));
    }
    public static void merge(int[] arr , int s , int e){

        if(s >= e){
            return ;
        }

        int mid = s + (e-s)/2;

        merge(arr , s , mid);

        merge(arr , mid+1, e);

        mergeSort(arr , s , mid ,e);
    }

    public static void mergeSort(int[] arr , int s , int mid , int e){

        ArrayList<Integer> result = new ArrayList<>();

        int l = s ;

        int r = mid + 1;

        while(l <= mid && r <= e){

            if(arr[l] < arr[r]){
                result.add(arr[l]);
                l++;
            }
            else{
                result.add(arr[r]);

                r++;
            }
        }

        while(l<=mid){
            result.add(arr[l]);
            l++;
        }
        while(r<=e){
            result.add(arr[r]);
            r++;
        }

        for(int i=s;i<=e;i++){
            arr[i] = result.get(i-s);
        }
    }
}
