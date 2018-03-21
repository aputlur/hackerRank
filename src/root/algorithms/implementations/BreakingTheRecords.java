package root.algorithms.implementations;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/11/18
 * Time: 9:16 PM
 */
public class BreakingTheRecords {

    public static void main(String[] args) {

        int[] result = breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
        for (int r : result) {
            System.out.println(r);
        }
    }

    static int[] breakingRecords(int[] score) {

            int max = score[0];
            int min = score[0];
            int maxUp = 0;
            int minDown = 0;
            int[] result = new int[2];

            for (int i = 1; i < score.length; i++) {

                if (score[i] > max) {
                    maxUp++;
                    max = score[i];
                } else if (score[i] < min) {
                    minDown++;
                    min = score[i];
                }
            }
            result[0] = maxUp;
            result[1] = minDown;
            return result;
        }

}
