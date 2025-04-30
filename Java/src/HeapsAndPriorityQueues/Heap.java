package HeapsAndPriorityQueues;
import java.util.ArrayList ;
// Heap implementation Using ArrayList ;
// This is also " Priority Queue " .
// Time Complexity --> O( log N) .
// MaxHeap() or MinHeap() .
public class Heap {

    ArrayList<Integer> heap ;

    Heap(){

        heap = new ArrayList<>();

    }
    int parent(int index){

        return (index-1) /2 ;
    }

    int left(int index){
        return 2*index + 1;
    }

    int right(int index ){
        return 2*index + 2 ;
    }

    void insert(int val){

        heap.add(val);
        int index = heap.size() - 1;

        upHeap(index);
    }

    void upHeap(int index){

        if(index == 0){
            return ;
        }

        int parentIndex = parent(index);

        if(heap.get(index) < heap.get(parentIndex)){

            swap(index , parentIndex);

            upHeap(parentIndex);
        }

        return ;
    }

    public ArrayList<Integer> HeapSort(){

        ArrayList<Integer> h = new ArrayList<>();

        while(! heap.isEmpty()){
            h.add(remove());
        }
        return h ;
    }

    int remove(){

        if(heap.isEmpty()){
            return -1111;
        }

        int val  = heap.get(0);

        int val2 = heap.remove(heap.size()-1);

        if(! heap.isEmpty()){
            heap.set(0 , val2);
            downHeap(0);
        }
        return val ;
    }

    void downHeap(int index){

        int minIndex = index ;

        int left = left(index);

        int right = right(index);

        if(left < heap.size() && heap.get(minIndex) > heap.get(left)){
            minIndex  = left ;
        }
        if(right < heap.size() && heap.get(minIndex) > heap.get(right)){

            minIndex = right ;
        }

        if(minIndex != index){
            swap(minIndex , index);
            upHeap(minIndex);
        }

        return ;
    }

    void swap(int i , int j){

        int value = heap.get(i);

        heap.set(i, heap.get(j));

        heap.set(j , value);
        return ;
    }
    public static void main(String[] args) {

        Heap heap = new Heap();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.HeapSort();
        System.out.println(list);

    }

}
