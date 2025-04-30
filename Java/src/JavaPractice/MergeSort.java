package JavaPractice;
import java.util.Arrays;
import java.util.ArrayList;

// This is One of the Sorting Algorithm works on " Divide & conquer Algorithm " .
// Time complexity of the Algorithm is : O(N * log N) , Space  complexity : O(N) .
public class MergeSort {

    public static void main(String[] args){

        int[] arr = {5,4,3,99 , -111, 0,300 ,2,1};

        merge(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] arr , int s , int e){
        if( s >= e){

            return ;
        }

        int mid = (s + e) / 2 ;

        merge(arr , s , mid);

        merge(arr , mid+1 , e);

        mergeSort(arr , s , mid , e);
    }

    public static void mergeSort(int[] arr , int s , int mid , int e){

        ArrayList<Integer> temp = new ArrayList<Integer>();

        int i = s;

        int j = mid+1;

        while( i <= mid && j <= e){

            if(arr[i] < arr[j]){
                temp.add(arr[i]);
                i++;
            }

            else{
                temp.add(arr[j]);

                j++;
            }
        }
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j <= e){
            temp.add(arr[j]);
            j++;
        }

        for(int p = s ; p <= e ; p++){

            arr[p] = temp.get(p - s);
        }
    }
}
