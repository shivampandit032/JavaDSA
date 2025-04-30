package JavaPractice;

public class SinglyLinkedList {

    Node head ;

    int size ;

    Node tail ;
    public SinglyLinkedList(){
        head = null;
        size = 0 ;
        tail = null;
    }
    public class Node{
        int data ;

        Node next ;

        public Node(int v){
            this.data = v;
            this.next = null;
        }

    }

    public void insertion(int val){
        if(isEmpty()){
            Node node = new Node(val);
            head = node ;
            tail = head ;
            size++;
            return ;
        }
        Node node = new Node(val);
        node.next = head ;
        head = node ;
        size++;
        return ;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false ;
    }

    public void display(){

        if(!isEmpty()){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next ;
            }
            System.out.print("END");
        }
    }

    public void deletion(int index){

        if(index == 1){

            head = head.next ;

            return ;
        }

        if(isEmpty()){
            System.out.println("Linked List is Empty !");
            return ;
        }

        Node temp = head ;

        for(int i = 0 ; i< index - 2 ; i++){
            temp = temp.next ;
        }

        temp.next = temp.next.next ;

        return ;
    }
    public static void main(String[] args){

        SinglyLinkedList sl = new SinglyLinkedList();

        int[] arr = {10 , 20 , 30 , 40 , 50 , 60};

        for(int i = 0 ; i< arr.length; i++){

            sl.insertion(arr[i]);
        }

        sl.display();

        System.out.println();

        sl.deletion(2);

        System.out.println();

        sl.display();
    }
}
