public class FriendCircles {
    public static int findCircleNum(int[][] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(arr, visited, i);
                count++;
            }
        }
        return count;
    }

    static void dfs(int[][] arr, boolean[] visited, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(arr, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] friends = {
                { 1, 1, 0, 0 },
                { 1, 1, 0, 0 },
                { 0, 0, 1, 1 },
                { 1, 0, 1, 1 },
        };
        System.out.println("Number of friend circles: " + findCircleNum(friends));
    }
}