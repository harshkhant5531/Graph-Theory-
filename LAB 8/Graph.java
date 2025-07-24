public class Graph {
    private int numVertices;
    private boolean[][] adjacencyMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print((adjacencyMatrix[i][j] ? "1 " : "0 "));
            }
            System.out.println();
        }
    }

    public boolean isConnected() {
        boolean[] visited = new boolean[numVertices];
        dfs(0, visited);

        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

    private void dfs(int current, boolean[] visited) {
        visited[current] = true;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[current][i] && !visited[i]) {
                dfs(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        graph.printGraph();

        if (graph.isConnected()) {
            System.out.println("Graph is connected.");
        } else {
            System.out.println("Graph is NOT connected.");
        }
    }
}
