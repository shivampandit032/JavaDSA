package SampleCodes;
// Stack is a data structure following " LIFO " Mechanism .
public class Stack {
    int[] arr = new int[5];

    int size;

    int ptr;

    Stack() {
        size = 0;
        ptr = -1;

    }

    public void push(int val) {

        if (isFull()) {
            System.out.println("Stack is Full !");
            return;
        }
        arr[++ptr] = val;
        size++;
        return;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is Empty !");
            return -1;
        }
        int element = arr[ptr--];
        size--;

        return element;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == arr.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  "+st.pop());
            System.out.println("_________");
        }

    }

}
