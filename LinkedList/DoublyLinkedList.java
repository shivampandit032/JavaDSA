package LinkedList;

public class DoublyLinkedList {

    Node head ;

    public class Node{
        int value ;
        Node next ;
        Node prev ;
        Node(int value){
            this.value = value ;
            this.prev = null;
            this.next = null;
        }
    }

    void insertAtFirst(int value){

        if(head == null){

            Node node = new Node(value);

            node.next = head ;

            head = node ;

            return ;
        }

        Node node = new Node(value);

        node.next = head ;

        head.prev = node ;

        head = node;

        return ;
    }
    void insertAtLast(int value){

        if(head == null){

            insertAtFirst(value);

            return ;
        }

        Node temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }
        Node node = new Node(value);

        temp.next = node;

        node.prev = temp;

        temp = node;

        return ;
    }

    void displayForward(){

        Node temp = head ;
        System.out.print("START -> ");
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next ;
        }
        System.out.println("END");
    }
    void displayBackward(){

        Node temp = head ;

        while(temp.next != null){
            temp = temp.next;
        }
        System.out.print("END -> ");
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        System.out.print("Start");
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();

        for(int i=0;i<5;i++){
            ll.insertAtFirst(i);
        }

        ll.displayForward();
        ll.displayBackward();
    }
}
