package BasicsOfJavaProgrammingLanguage;
import java.util.ArrayList;
// ArrayList is a Dynamic Sized Array in Java .
public class ArrayListInJava {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            arr.add(i);
        }

        System.out.println(arr);

        System.out.print(arr.get(3));
        System.out.println();
        System.out.print(arr.indexOf(0));
    }
}
