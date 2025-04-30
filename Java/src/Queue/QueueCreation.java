package Queue;
/*
Queue is A Data Strucutre , which follows " First in First Out or Last in Last Out " mechanism .
ADTs of Queue Data structures are :
    a) enqueue() : inserting an element in the queue from end  -> Time complexity : O(1) .
    b) dequeue() : deleting an elment from the front of the queue -> Time complexity : O(1) .

Implementations :
    Queue can be implemented by using :
        a) Array .
        b) Linked List .
        c) Stack .
 */


public class QueueCreation {

    int n = 5 ;

    int[] arr = new int[n];

    int front ;
    int end ;

    int size ;

    QueueCreation(){
        front = 0 ;
        end = 0 ;
        size = 0 ;
    }

    void enqueue(int num){
        if(isFull()){
            System.out.println("Queue is Full !");
            return ;
        }

        arr[front++] = num;

        size++;

        return ;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");

            return -1;
        }

        int number = arr[end--];

        size--;

        return number;
    }

    boolean isFull(){
        if(size == arr.length){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        QueueCreation q = new QueueCreation();

        for(int i=0;i<5;i++){
            q.enqueue(i);
        }

        for(int i=0;i<5;i++){
            System.out.print(q.dequeue()+" -> ");
        }
    }
}
