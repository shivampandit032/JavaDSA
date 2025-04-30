package JavaPractice;
import java.util.Arrays;
// This is one of the Stable Sorting  Algorithm . Time complexity of the Algorithm is : O(N*N) .
// Space complexity of the Algorithm is : O(1) .
public class InsertionSort {

    public static void main(String[] args){

        int[] arr = {5,4,3, -999 , 1111, 0, 323,2,1};

        int n = arr.length;

        for(int i=1 ; i < n ;i++){

            for(int j = i-1; j>= 0 ; j--){

                if(arr[j] > arr[i]){
                    int temp = arr[j];

                    arr[j] = arr[i];

                    arr[i] = temp ;

                    i = j ;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
