package root.algorithms.implementations;

import java.util.Arrays;


public class PickingNumbers {

    public static void main(String[] args) {

        System.out.println("Total -> " + pickNumbers(new int[]{4, 6, 5, 3, 3, 1}));
    }

    private static int pickNumbers(int[] input) {

        Arrays.sort(input);
        int maxCount = 0;
        for (int i = 0; i < input.length; i++) {

            int currentCount = 0;
            for (int j = 0; j <= i; j++) {

                if (Math.abs(input[i] - input[j]) <= 1) {
                    currentCount++;
                    if(currentCount > maxCount) maxCount = currentCount;
                }
            }
        }

        return maxCount;
    }
}
