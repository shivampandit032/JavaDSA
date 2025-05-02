package Hashing;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {

        int[] arr = {1 ,2 ,3, 2 , 1 ,12};

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i< arr.length ;i++){

            Integer value = map.get(arr[i]);

            map.put(arr[i] , value++);

        }

        System.out.println(map);
    }
}
