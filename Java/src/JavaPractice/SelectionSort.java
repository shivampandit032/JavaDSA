package JavaPractice;
import java.util.Arrays ;
// This is One of the Unstable Sorting Algorithm . Time complexity is : O(N*N) .
// Space complexity of the Algorithm is : O(1) .
public class SelectionSort {

    public static void main(String[] args){

        int[] arr = {5,4,3,2,-111,0 , 9999,323,1};

        int n = arr.length;

        for(int i=0;i<n-1;i++){

            int minIndex = i;

            for(int j = i+1; j<n ;j++){

                if(arr[minIndex] > arr[j]){

                    minIndex = j;
                }
            }

            int temp = arr[minIndex];

            arr[minIndex] = arr[i];

            arr[i] = temp ;
        }

        System.out.println(Arrays.toString(arr));
    }
}
