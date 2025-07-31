
public class LaplacianMatrix {

    public static void main(String[] args) {

        int[][] adjacencyMatrix = {
                { 0, 1, 1, 0 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 0, 0, 1, 0 }
        };

        int n = adjacencyMatrix.length;
        int[][] degreeMatrix = new int[n][n];
        int[][] laplacianMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++) {
                degree += adjacencyMatrix[i][j];
            }
            degreeMatrix[i][i] = degree;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                laplacianMatrix[i][j] = degreeMatrix[i][j] - adjacencyMatrix[i][j];
            }
        }

        System.out.println("Lapalacian Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
