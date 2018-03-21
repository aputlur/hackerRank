package root.algorithms.implementations;

import java.util.Arrays;


public class BirthdayChocalate {

    public static void main(String[] args) {
        int totalMatches = solve2(5, new int[]{1, 1, 1, 1, 1}, 2, 2);
        System.out.println("with optimal solution : " + totalMatches);
        int totalMatches2 = solve4(5, new int[]{1, 1, 1, 1, 1}, 2, 2);
        System.out.println("total matches : " + totalMatches2);

    }

    //Best Solution
    static int solve4(int n, int[] s, int d, int m) {
        int total = 0;
        for (int i = 0; i <= n - m; i++) {
            if (Arrays.stream(s, i, i + m).sum() == d) total++;
        }
        return total;
    }


    static int solve2(int n, int[] s, int d, int m) {
        int pointer = 0;
        int counter = 0;

        while (pointer < n) {
            int total = 0;
            for (int i = 0; i < m; i++) {
                if (pointer + i < n)
                    total += s[pointer + i];
            }
            if (total == d) counter++;
            pointer++;
        }
        return counter;
    }


    //Wrong solution
    static int solve(int n, int[] s, int d, int m) {
        int counter = 0;
        for (int outer = 0; outer < n; outer++) {
            int monthTotal = 0;
            for (int inner = outer; inner < m; inner++) {
                monthTotal += s[inner];
            }
            if (monthTotal == d) counter++;
        }
        return counter;
    }
}
