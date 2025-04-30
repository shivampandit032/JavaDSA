package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeetcodeQuestions {

    Node root ;

    public class Node{
        int val ;

        Node left ;

        Node right;

        Node(int value){

            this.val = value;
        }
    }

    void insert(int value){
        root = insert(root , value);
    }

    Node insert(Node node , int value){

        if(node == null){
            Node temp = new Node(value);

            return temp;
        }
        if(value < node.val){
            node.left = insert(node.left , value);
        }
        if(value > node.val){
            node.right = insert(node.right , value);
        }

        return node ;
    }
    void display(){

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        int size = q.size();

        int sum = 0;

        for(int i=0;i<size;i++){

            Node node = q.poll();

            int n = node.val;

            sum += n;

            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null ){
                q.offer(node.right);
            }
        }
        System.out.println(sum);
        double avg = (double) sum / size ;

        System.out.print(avg+" , ");

    }

    public static void main(String[] args) {
        LeetcodeQuestions q = new LeetcodeQuestions();

        q.insert(2147483647);
        q.insert(2147483647);
        q.insert(2147483647);

        q.display();
    }
}
