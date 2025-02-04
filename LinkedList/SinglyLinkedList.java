package LinkedList;

public class SinglyLinkedList {

    Node head ;

    public class Node{
        int value ;

        Node next ;

        Node(int value){
            this.value = value;

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

        head = node ;

        return ;
    }
    void insertAtLast(int value){
        // Time complexity : O(N) .
        if(head == null){
            // if Linked list is Null , means there is no Node in Linked list .
            insertAtFirst(value);

            return ;
        }

        Node temp = head ;

        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);

        temp.next = node;

        temp = node;

        return ;
    }
    void display(){

        Node temp = head ;

        while(temp != null){

            System.out.print(temp.value+" -> ");

            temp = temp.next ;
        }
        System.out.println("END");
    }
    void deleteAtFirst(){
        if(head == null){
            System.out.println("LinkedList is Empty , Can't delete !");

            return ;
        }

        Node temp = head ;

        head = head.next ;

        temp.next = null;

        return ;
    }
    void deleteAtLast(){
        // Time complexity : O(N)
        if(head==null){
            System.out.println("Linked List is Empty , Can't delete !");
            return ;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return ;
    }
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        for(int i=0 ; i< 5 ;i++){
            ll.insertAtFirst(i);
        }
        ll.insertAtLast(5);
        ll.display();
        System.out.println();
        ll.deleteAtFirst();
        ll.display();
        System.out.println();
        ll.deleteAtLast();
        ll.display();
        System.out.println();
    }
}
