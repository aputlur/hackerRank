package root.algorithms.implementations;

import java.util.Arrays;
import java.util.Scanner;


public class BanApatite {

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        int k = scanner.nextInt(); scanner.nextLine();

        String charges = scanner.nextLine();
        String[] strings = charges.split(" ");
        int total = 0;
        for (int i = 0; i < n; i++) {
            if(i!=k) total+=Integer.valueOf(strings[i]);
        }
        int bCharged = scanner.nextInt();

        System.out.println((total/2 == bCharged) ? "Bon Appetit" : (bCharged - (total/2)));

    }

    private static String calculate(int n, int[] arr_i, int exclude, int bShare) {

        int sum = (Arrays.stream(arr_i).sum()) - arr_i[exclude];

        if ((sum / 2) == bShare) return "Bon Appetit";
        else {
            return String.valueOf(sum -bShare);
        }
    }












//
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int k = scanner.nextInt();
//    int total = 0;
//
//        for (int i = 0; i < n; i++) {
//        int price = scanner.nextInt();
//        if (i != k) total += price;
//    }
//
//    int charged = scanner.nextInt();
//
//        System.out.println(total / 2 == charged ? "Bon Appetit" : charged - (total/2));
//}
}
