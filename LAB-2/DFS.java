import java.util.*;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF VERTICES:");
        int vertices = sc.nextInt();

        System.out.println("ENTER NUMBER OF EDGES:");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("ENTER" + " " + edges + " " + "EDGES (U V)");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        boolean[] visited = new boolean[5];
        Stack<Integer> stack = new Stack<>();

        System.out.print("ENTER STARTING NUMBER TO CHECK DFS:");
        int start = sc.nextInt();

        stack.push(start);

        while (!stack.isEmpty()) {
            int ans = stack.pop();

            if (!visited[ans]) {
                visited[ans] = true;
                System.out.println(ans + " ");
            }

            for (int n : graph.get(ans)) {
                if (!visited[n]) {
                    stack.push(n);
                }
            }

        }

        sc.close();

    }

}
