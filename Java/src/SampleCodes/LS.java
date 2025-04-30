package SampleCodes;
import java.util.Scanner ;
// TC : O(N) , SC : O(1) .
public class LS {
    public static void main(String[] args){
        int[] arr = {1 , 2, 3, 4, 5 ,6 , 8 ,10};

        System.out.print("Enter the element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        String name = "shivam";
        int size = name.length();
        int result = ls(arr , tar);
        if(result == -1){
            System.out.println("Element not found !");
        }
        else{
            System.out.println("Index of the target element is : "+result);
        }
    }
    public static int ls(int[] arr , int target ){

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
