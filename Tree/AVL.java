package Tree;
// AVL = Adelson , Velskii and Lendis Tree .
// This is a " Self - balancing Binary Tree " .
// Height each node must be in " -1 , 0 , 1" .
// beyond these values , it will rearrange itself to maintain height of each node .
public class AVL {

    Node root ;

    public class Node{

        int value;

        Node left ;

        Node right;

        int height;

        Node(int value){
            this.value = value ;

            this.left = null;

            this.right = null;

            this.height = 0 ;

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

        node.height = Math.max(getHeight(node.left), getHeight(node.right))+1;

        return balance(node);
    }

    Node balance(Node node){

        if(getHeight(node.left) - getHeight(node.right) > 1){
            // Left heavy case

            if(getHeight(node.left.left) - getHeight(node.left.right) > 0){
                // left - left case

                return rightRotate(node);
            }

            if(getHeight(node.left.left) - getHeight(node.left.right) < 0){

                // left - right case

                node.left = leftRotate(node.left);

                return rightRotate(node);
            }
        }

        if(getHeight(node.left) - getHeight(node.right) < -1){
            // right heavy case

            if(getHeight(node.right.left) - getHeight(node.right.right) < 0){
                // right - right case

                return leftRotate(node);
            }

            if(getHeight(node.right.left) - getHeight(node.right.right) > 0){
                // right - left case

                node.right = rightRotate(node.right);

                return leftRotate(node);
            }
        }

        return node;
    }

    Node leftRotate(Node p){
        Node c = p.right ;

        Node t = c.left ;

        c.left = p;

        p.right = t ;

        p.height = Math.max(getHeight(p.left) , getHeight(p.right))+1;
        c.height = Math.max(getHeight(c.left) , getHeight(c.right))+1;

        return c;
    }
    Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;

        p.left = t ;

        p.height = Math.max(getHeight(p.left) , getHeight(p.right))+1;
        c.height = Math.max(getHeight(c.left) , getHeight(c.right))+1;

        return c ;
    }
    int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public static void main(String[] args) {

        AVL tree = new AVL();

        for(int i=0;i<1024;i++){
            tree.insert(i);
        }

        System.out.println(tree.getHeight(tree.root));
    }
}
