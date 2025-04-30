package JavaPractice;

import java.util.Scanner;

// Linear search Algorithm . Time complexity is : O(N) and Space Complexity : O(1) .

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int index = linearSearch(arr);

        if(index == -1){
            System.out.println("Element that you are searching isn't present !");
        }
        else{
            System.out.println("Index of the element you are searching is : "+index);

        }
    }
    public static int linearSearch(int[] arr){
        System.out.print("Enter the element you want to search : ");
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target ){
                return i;
            }
        }

        return -1;
    }
}
