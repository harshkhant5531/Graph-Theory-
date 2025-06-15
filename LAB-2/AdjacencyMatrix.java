
public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 0, 1 },
                { 1, 2 },
                { 2, 0 },
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "->" + arr[i][1]);
        }
    }

}
