import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class DominantSet {

    static boolean isDominant(int N, List<Integer> adj[], Set<Integer> S) {

        boolean[] cov = new boolean[N + 1];

        for (int v : S) {
            cov[v] = true;
            for (int u : adj[v]) {
                cov[u] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!cov[i]) {
                return false;
            }
        }
        return true;

    }

    static void Dominant(int N, List<Integer> adj[]) {
        double subSet = Math.pow(2, N);
        System.out.println("Possible dominant set");
        for (int i = 1; i < subSet; i++) {
            Set<Integer> temp = new HashSet<>();

            for (int j = 0; j < N; j++) {
                if ((i & (int) Math.pow(2, j)) != 0) {
                    temp.add(j + 1);
                }

            }

            if (isDominant(N, adj, temp)) {
                System.out.println(temp);
            }
        }

    }

    public static void main(String[] args) {
        int N = 4;
        int[][] edges = { { 1, 2 }, { 1, 3 }, { 3, 4 }, { 2, 4 } };

        List<Integer>[] adj = new ArrayList[N + 1];
        
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        Dominant(N, adj);
    }
}