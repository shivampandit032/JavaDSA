package Tree;

public class BinarySearchTree {

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
    Node  insert(Node node , int value){

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
    void preOrder(Node node){
        // N -> L -> R

        if(node == null){

            return ;
        }

        System.out.print(node.value + " -> ");

        preOrder(node.left);

        preOrder(node.right);
    }
    void postOrder(Node node){
        // L -> R -> N

        if(node == null){
            return;
        }
        postOrder(node.left);

        postOrder(node.right);

        System.out.print(node.value + " -> ");
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] arr = { 5,3,1,98,32,332,34};

        for(int i=0;i<arr.length; i++){
            tree.insert(arr[i]);
        }

        tree.inOrder(tree.root);
        System.out.println("INORDER TRAVERSAL");

        tree.preOrder(tree.root);
        System.out.println("PREORDER TRAVERSAL");

        tree.postOrder(tree.root);
        System.out.println("POSTORDER TRAVERSAL");
    }
}
