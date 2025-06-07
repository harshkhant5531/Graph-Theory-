import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int output[][] = new int[3][3];

        System.out.println("For matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("For matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("For condition matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                output[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    output[i][j] += arr1[i][j] * arr2[i][j];
                }

            }
        }

        System.out.println("Output matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Output is:" + output[i][j]);

            }
        }

    }
}
