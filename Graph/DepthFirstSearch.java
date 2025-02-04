package Graph;

import java.util.*;

// Time complexity : O(N) + O(2*E) and Space complexity : O(N) .

public class DepthFirstSearch {

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj) {

        int[] visit = new int[v];   // for 1 based indexing Graph

        ArrayList<Integer> ls = new ArrayList<>();

        int start = 1;

        dfsDisplay(v, adj, visit, ls);

        System.out.println(ls);
    }

    public static void dfsDisplay(int node, ArrayList<ArrayList<Integer>> adj, int[] visit, ArrayList<Integer> ls) {

        visit[node] = 1;

        ls.add(node);

        // now we will traverse for all neighbouring connected nodes of "node"

        for (Integer it : adj.get(node)) {

            if (visit[it] == 0) {

                dfsDisplay(it, adj, visit, ls);
            }
        }
    }

    public static void main(String[] args) {

    }

}
