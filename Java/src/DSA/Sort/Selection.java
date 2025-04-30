package DSA.Sort;
import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int max = 0 ;

            for(int j =0 ;j<n-i ; j++){

                if(arr[max] < arr[j]){
                    max = j;
                }
            }

            int temp = arr[max];

            arr[max] = arr[n-i-1];

            arr[n-i-1] = temp ;
        }
    }
}
