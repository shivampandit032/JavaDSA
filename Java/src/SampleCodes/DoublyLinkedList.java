package SampleCodes;

public class DoublyLinkedList {

    Node head ;
    Node tail;

    public class Node{

        int value ;

        Node next ;

        Node prev ;

        Node(int v){

            this.value = v;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert(int val){

        if(head == null){

            Node temp = new Node(val);

            head = temp ;

            tail = head ;

            return ;
        }

        Node temp = new Node(val);

        temp.next = head ;

        head.prev = temp ;

        head = temp ;

        return ;
    }


    public void display(){

        Node temp = head ;

        while(temp != null){

            System.out.print(temp.value + " -> ");

            temp = temp.next ;
        }
        System.out.print("End");
    }
    public void displayBack(){
        Node temp = tail ;

        while(temp != null){
            System.out.print(" <- "+temp.value);
            temp = temp.prev;
        }
        System.out.print(" <- START");
    }
    public static void main(String[] args) {

        int[] arr = { 10 , 20 , 30 , 40 , 50 , 60 , 70};

        DoublyLinkedList dl = new DoublyLinkedList();

        for(int i = 0; i< arr.length ; i++){

            dl.insert(arr[i]);
        }

        dl.display();
        System.out.println();
        dl.displayBack();
    }
}
