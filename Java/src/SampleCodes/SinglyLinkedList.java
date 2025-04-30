package SampleCodes;

public class SinglyLinkedList {

    Node head ;
    Node tail ;

    public class Node{

        int value ;
        Node next ;

        Node(int v){
            this.value = v;
            this.next = null;
        }

    }

    public void insert(int value){

        if(head == null){
            Node temp = new Node(value);

            head = temp ;

            tail = head ;

            return ;
        }

        Node temp = new Node(value);

        temp.next = head ;

        head = temp ;

        return ;
    }

    public void display(){

        Node temp = head ;

        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};

        SinglyLinkedList sl = new SinglyLinkedList();

        for(int i=0;i<arr.length;i++){
            sl.insert(arr[i]);
        }

        sl.display();
    }
}
