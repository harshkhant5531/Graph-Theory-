public class Edge{
    public static void main(String[] args) {
        int m=4;
        int n=5;
        int [][] arr={{1,2},{2,3},{4,5},{1,5}};

        int [][] adjMat=new int[n][n];

        for(int i=0;i<m;i++){
            int x=arr[i][0]-1;
            int y=arr[i][1]-1;
            adjMat[x][y]=1;
            adjMat[y][x]=1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(adjMat[i][j] + " ");
            }

            System.out.println();
        }
    }
}