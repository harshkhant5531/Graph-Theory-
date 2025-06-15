import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int[][] graph = new int[][] {
                { 0, 1 },
                { 1, 2 },
                { 1, 3 },
                { 2, 3 },
                { 3 }
        };

        boolean[] visited = new boolean[5];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.err.println(node + " ");

            for (int n : graph[node]) {
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }
}
