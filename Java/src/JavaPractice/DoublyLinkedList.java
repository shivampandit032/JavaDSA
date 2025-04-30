package JavaPractice;

public class DoublyLinkedList {
    Node head ;
    Node tail;

    public class Node{
        int value;
        Node next ;
        Node prev ;

        Node(int val ){
            this.value = val;
            this.next = null;
            this.prev = null;
        }

        Node(int val , Node pre , Node succ){
            this.value = val;
            this.next = succ;
            this.prev = pre;
        }
    }

    public void creation(int value){
        if(head == null){
            Node temp = new Node(value);
            head.next = temp ;
            temp.prev = head;
            head = temp;
            tail = head ;
            return ;
        }
        Node temp = new Node(value);

    }
    public static void main(String[] args) {

    }
}
