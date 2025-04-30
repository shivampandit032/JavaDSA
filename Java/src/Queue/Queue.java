package Queue;
import java.util.Stack;

public class Queue {

    // This is the implementation of " Queue " using " Two Stack "

    Stack p ;
    Stack q ;

    Queue(){
        p = new Stack();
        q = new Stack();
    }

    void enqueue(int val){

        while(! p.isEmpty()){

            q.push(p.pop());
        }

        p.push(val);

        while(! q.isEmpty()){
            p.push(q.pop());
        }

    }

    void dequeue(){

        System.out.println(p.pop());
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,7,8};

        Queue q = new Queue();

        for(int i = 0 ; i< arr.length ;i++){
            q.enqueue(arr[i]*100);
        }

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

    }
}
