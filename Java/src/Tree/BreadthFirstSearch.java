package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    Node root ;

    public class Node{
        int value ;
        Node left ;
        Node right;

        Node(int value){
            this.value = value;

            this.left = null;

            this.right = null;

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
        if(value < node.value){

            node.left = insert(node.left , value);
        }
        if(value > node.value){
            node.right = insert(node.right , value);
        }

        return node;
    }

    void inOrder(Node node){
        // L -> N -> R
        if(node == null){

            return ;
        }
        inOrder(node.left);

        System.out.print(node.value + "  ->  ");

        inOrder(node.right);
    }
    // This is The ONE of " Most Important Traversal Algorithm in Tree " .
    void BFS(Node node){

        Queue<Node> q = new LinkedList<>();

        q.offer(node);

        while(!q.isEmpty()){

            Node n = q.poll();

            System.out.print(n.value + " -> ");

            if(n.left != null){
                q.offer(n.left);
            }
            if(n.right != null){
                q.offer(n.right);
            }

        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        int[] arr = {5,6,2,3243,3,99,0,32,335};

        for(int i=0;i<arr.length;i++){
            bfs.insert(arr[i]);
        }

        bfs.inOrder(bfs.root);
        System.out.println("INORDER TRAVERSAL ");

        bfs.BFS(bfs.root);
        System.out.println("BREADTH FIRST SEARCH ALGORITHM");
    }
}
