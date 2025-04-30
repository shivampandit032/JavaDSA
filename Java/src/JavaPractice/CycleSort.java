package JavaPractice;
import java.util.Arrays;

// Time complexity of the Algorithm is : O(N) .
// Space complexity of the Algorithm is : O(1) .

public class CycleSort {

    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};

        for(int i=0 ;i < arr.length; i++){

            int correctIndex = arr[i]-1;

            if(arr[correctIndex] != arr[i]){

                int temp = arr[i];

                arr[i] = arr[correctIndex];

                arr[correctIndex] = temp ;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
