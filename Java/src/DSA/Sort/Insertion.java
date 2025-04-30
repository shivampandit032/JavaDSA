package DSA.Sort;
import java.util.Arrays;
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};

        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){

            int element = i;

            for(int j=i-1;j>=0;j--){
                if(arr[element] < arr[j]){
                    int temp = arr[element];

                    arr[element] = arr[j];

                    arr[j] = temp ;

                    element = j ;
                }
            }
        }
    }
}
