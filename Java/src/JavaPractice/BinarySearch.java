package JavaPractice;

import java.util.Scanner ;

// Binary search Algorithm in 1D array . Time complexity is : O(log N) and Space Complexity : O(1)

public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        int index = binarySearch(arr);

        if(index == -1){
            System.out.println("Element that you are Searching isn't present in the Array !");
        }
        else{
            System.out.println("The index of the target element that you want to search is : "+index);
        }
    }
    public static int binarySearch(int[] arr){

        System.out.print("Enter the element you want to search : ");

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int s = 0;
        int e = arr.length-1;

        while(s <= e){

            int mid = s + (e - s)/2;

            if(target < arr[mid]){
                e = mid -1 ;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
            else{
                return mid ;
            }
        }

        return -1 ;
    }
}
