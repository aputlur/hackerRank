package root.algorithms.implementations;


import java.util.Scanner;

public class MagicSquareSolution {


    static int formingMagicSquare(int[][] as) {
        int[][] a1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] a2 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        int[][] a3 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        int[][] a4 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        int[][] a5 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        int[][] a6 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        int[][] a7 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] a8 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};


        int min = Integer.MAX_VALUE;
        int[] sum = new int[8];


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                sum[0] += Math.abs(as[i][j] - a1[i][j]);
                sum[1] += Math.abs(as[i][j] - a2[i][j]);
                sum[2] += Math.abs(as[i][j] - a3[i][j]);
                sum[3] += Math.abs(as[i][j] - a4[i][j]);
                sum[4] += Math.abs(as[i][j] - a5[i][j]);
                sum[5] += Math.abs(as[i][j] - a6[i][j]);
                sum[6] += Math.abs(as[i][j] - a7[i][j]);
                sum[7] += Math.abs(as[i][j] - a8[i][j]);

            }

        for (int i = 0; i < 8; i++) {
            if (sum[i] < min) {
                min = sum[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int s_i = 0; s_i < 3; s_i++) {
            for (int s_j = 0; s_j < 3; s_j++) {
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}