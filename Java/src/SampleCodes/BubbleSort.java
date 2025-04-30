package SampleCodes;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = { 5,4,3,2,1};
        int n = arr.length;
        for(int i = 0 ; i< n-1 ; i++){
            for(int j = 1 ; j < n-i ; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];

                    arr[j] = arr[j-1];

                    arr[j-1] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
