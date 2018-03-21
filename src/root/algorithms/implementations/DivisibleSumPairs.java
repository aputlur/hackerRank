package root.algorithms.implementations;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/12/18
 * Time: 1:20 PM
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {

        int counter = divisibleSumPairs(3, 6, new int[]{1, 3, 2, 6, 1, 2});
        System.out.println("number of pairs -> " + counter);

        int counter1 = singlePass(3, 6, new int[]{1, 3, 2, 6, 1, 2});
        System.out.println("number of pairs -> " + counter1);
    }


    private static int singlePass(int k, int n, int[] input) {

        Map<Integer, Integer> store = new LinkedHashMap<>();
        int counter = 0;

        for (int i = 0; i < n; i++) {

            int mod = input[i] % k;
            int need = (k - mod) % k;

            if (store.containsKey(need)) {
                counter++;
            }
            if (!store.containsKey(mod))
                store.put(mod, 1);
        }

        return counter;

    }


    //brute-force approach
    private static int divisibleSumPairs(int k, int n, int[] input){
        int counter = 0 ;

            for(int o=0;o<input.length;o++){

                for(int i=o;i<input.length-1;i++){

                    if((input[o]+input[i+1])%k==0) {

                        System.out.println("pair matched : (" + o + "," + (i+1) + ")");
                        counter++;
                    }

                }

            }


        return counter;
    }
}
