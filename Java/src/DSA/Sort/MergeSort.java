package DSA.Sort;
import java.util.ArrayList;
import java.util.Arrays;
/*
IT is a type of " Divide And Conquer sorting Algorithm " .
Time complexity : O(N*log N) and Space complexity : O(N) .
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};

        merge(arr , 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] arr , int s , int e){
        if(s >= e){
            return ;
        }

        int mid = s + (e - s )/2 ;

        merge(arr , s , mid);
        merge(arr , mid + 1 , e);

        mergeSort(arr , s , mid , e);
    }
    public static void mergeSort(int[] arr , int low , int mid , int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int l = low ;
        int r = mid + 1;

        while(l <= mid && r <= high){
            if(arr[l] < arr[r]){
                temp.add(arr[l]);
                l++;
            }
            else{
                temp.add(arr[r]);
                r++;
            }
        }

        while(l <= mid){
            temp.add(arr[l]);
            l++;
        }

        while(r <= high){
            temp.add(arr[r]);
            r++;
        }

        for(int i= low ; i<= high ; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
