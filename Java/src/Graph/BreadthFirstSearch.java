package Graph;
import java.util.*;

// From take u forward .
// Time complexity : O(N) + O(2*edges) and space complexity : O(N) .
public class BreadthFirstSearch {


    public ArrayList<Integer> bfsOfGraph(int v , ArrayList<ArrayList<Integer>> adj){

        boolean[] visit = new boolean[v];

        Queue<Integer> q = new LinkedList<>();

        ArrayList<Integer> bfs = new ArrayList<>();

        q.add(0);
        visit[0] = true ;


        while(!q.isEmpty()){

            Integer node = q.poll();

            bfs.add(node);

            for(Integer it : adj.get(node)){
                if(!visit[it]){
                    visit[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        ArrayList<Integer> result = bfs.bfsOfGraph(5,adj);

        for(Integer i : result){
            System.out.println(i);
        }
    }
}
