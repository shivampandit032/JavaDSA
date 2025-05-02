package HashMap;
import java.util.HashSet;
import java.util.Iterator;
/*
    HashSet is a Data Structure , where Time complexities are for : Insertion -> O(1) , Deletion -> O(1) and Searching -> O(1) .
 */

public class Hashset {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Contains only Unique Values
        set.add(1);

        set.add(2);

        set.add(3);

        set.add(2);

        // To Traverse Through Elements , It has " Iterators ".

        Iterator it = set.iterator();

        // hasnext() -> Returns " true or false " , if after current point has any element .

        if(it.hasNext()){

            System.out.println(it.next());
        }

        // To remove any elment

        set.remove(3);

        System.out.println("after removing element size of HashSet is : "+set.size());
    }
}
