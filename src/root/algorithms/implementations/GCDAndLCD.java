package root.algorithms.implementations;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/11/18
 * Time: 7:45 PM
 */

public class GCDAndLCD {

    public static void main(String[] args) {
        int[] input1 = {2,4};
        int[] input2 = {16,32,64};

      int count =  findCountBetweenTwoSets(input1,input2);
        System.out.println("Numbers between two sets : "+ count);

    }

    private static int findCountBetweenTwoSets(int[] input1, int[] input2) {

        int gcd = gcd(input2);
        System.out.println("GCD value -> "+ gcd);
        int lcd = lcd(input1);
        System.out.println("LCD value -> "+ lcd);

        int counter = 0;
        for (int i = lcd; i <=gcd; i+=lcd) {
            if(gcd%i==0) counter++;
        }
        return counter;
    }

   /*

    Greatest Common Divisor (GCD) for 2 4 is 2.

    Explanation

    The Greatest Common Divisor (GCD), also known as the Greatest Common Factor (GCF), or Highest Common Factor (HCF), of two or more non-zero integers, is the largest positive integer that divides the numbers without a remainder.

     In this example:

    Factors of 2 are: 1 , 2.

    Factors of 4 are: 1 , 2 , 2 , 4.

    The common elements between 2 and 4 are  : 2

    We see that the Greatest Common Factor (Divisor) is 2.*/


    private static int gcd(int[] array) {

        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
        }
        return result;
    }

    private static int lcd(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = lcd(result, array[i]);
        }
        return result;
    }

    private static int gcd(int i, int k) {

        while (k > 0) {
            int temp = k;
            k = i % k;
            i = temp;
        }
        return i;
    }

    /*
     The formula to find LCD is - a * (b/gcd(a,b));

    */
    private static int lcd(int a, int b) {

        return a * (b / gcd(a, b));
    }
}
