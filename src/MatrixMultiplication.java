import java.util.*;
public class MatrixMultiplication {
    public static void main(String... args) {

        Random random = new Random();

        int p = random.nextInt(15);
        int q = random.nextInt(15);
        int r = random.nextInt(15);

        int[][] a = new int[p][q];
        int[][] b = new int[q][r];
        int[][] c = new int[p][r];


        System.out.println("Matrix a:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100);
            }
        }

        for (int[] x : a) System.out.println(Arrays.toString(x));


        System.out.println("Matrix b:");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = random.nextInt(100);
            }
        }

        for (int[] y : b) System.out.println(Arrays.toString(y));



            System.out.println("Result of multiplication:");
            for (int i = 0; i < p; i++)
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < q; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            for (int[] z : c) System.out.println(Arrays.toString(z));

    }
}



