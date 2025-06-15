import java.util.*;

public class AdjacencyList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the vertices :");
        int ver = sc.nextInt();
        System.out.println("Enter the number of the edges :");
        int n = sc.nextInt();

        int[][] graph = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the starting vertex : ");
            int start = sc.nextInt();

            System.out.println("Enter the starting vertex : ");
            int end = sc.nextInt();

            graph[i][0] = start;
            graph[i][1] = end;

        }

        for (int i = 0; i < ver; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < n; j++) {
                if (graph[j][0] == i) {
                    System.err.print(graph[j][1] + ", ");
                }
            }
            System.out.println();
        }
        sc.close();

    }

}
