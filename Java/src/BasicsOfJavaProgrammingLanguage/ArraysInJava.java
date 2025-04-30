package BasicsOfJavaProgrammingLanguage;
import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" -> ");
        }

        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
