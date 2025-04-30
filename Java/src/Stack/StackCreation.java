package Stack;

/*
Stack is Data structure , which follows " Last In First Out Mechanism " .
ADTs of Stack Data structure is :
    a) push() : time complexity -> O(1).
    b) pop() : time complexity -> O(1) .

Implementations:
    a) stack can be implemented by " Array " .
    b) stack can be implemented by " Linked List " .
    c) stack can be implemented by " Queue Data structure " .
 */

public class StackCreation {

    int n = 5 ;
    int[] arr = new int[n];
    int size ;
    int ptr ;
    StackCreation(){

        this.size = 0 ;
        this.ptr = -1 ;
    }
    void push(int i){

        if(isFull()){
            System.out.println("Stack is Full !");
            return ;
        }

        arr[++ptr] = i ;

        size++;

        return ;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty , Can't pop Anything !");

            return -1;
        }

        int element = arr[ptr--];

        size--;

        return element ;
    }
    boolean isFull(){
        if(size == arr.length){
            return true ;
        }
        return false ;
    }
    boolean isEmpty(){
        if(size == 0){
            return true ;
        }
        return false ;
    }

    public static void main(String[] args){
        StackCreation st = new StackCreation();

        for(int i=0;i<4;i++){
            st.push(i);
        }
        st.push(4);
        st.push(11);
        System.out.println("The Last element that inserted is : "+st.pop());
        System.out.println("Size of array: "+st.size+" and current position of ptr pointer is : "+st.ptr);
    }
}
