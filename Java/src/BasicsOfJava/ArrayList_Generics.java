package BasicsOfJava;

import java.util.ArrayList;

public class ArrayList_Generics {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<5;i++){
            arr.add(i);
        }

        // for Loop in Java

        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");
        }
    }
}
