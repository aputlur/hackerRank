package root.algorithms.implementations;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class MigratoryBirds {

    public static void main(String[] args) {

        System.out.println(migratoryBirds( new int[]{1, 5, 5, 5, 5, 4, 4, 4, 5, 3}));
    }

    static int migratoryBirds(int[] ar) {

        return Arrays.stream(ar).boxed().collect(Collectors.collectingAndThen(Collectors.groupingBy(i -> i, Collectors.counting()), map ->
                map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey()));

    }
}
