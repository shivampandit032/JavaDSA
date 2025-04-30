package Graph;

import java.util.ArrayList;

public class Representation {

    public static void main(String[] args) {
        // Adjacency List to store every node and their neighbour nodes

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int n = 5; // Total Number of Nodes given in Input
        int m = 6; // Total number of Edges given in Input

        // Loop to store each node
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }

        // add neighbours of each node with whom they are connected
        // connected: 1-->2
        // eg : adj.get(1).add(2)
        // adj.get(2).add(1)


    }
}
