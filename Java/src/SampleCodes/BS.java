package SampleCodes;
import java.util.Scanner;
// TC : O(log N) , SC : O(1)

public class BS {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6 , 7 ,8, 9 ,10};

        System.out.print("Enter the element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result = bs(arr , target);

        if(result == -1){
            System.out.print("Element Not found !");
        }
        else{
            System.out.print("Index of the target element is : "+result);
        }
    }
    public static int bs(int[] arr , int target){
        int s = 0 ;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + ( e - s)/2 ;

            if(arr[mid] < target ){
                s = mid +1;
            }
            else if(arr[mid] > target){
                e = mid -1 ;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
