package root.algorithms.implementations;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/12/18
 * Time: 11:01 PM
 */
public class MaxConsecutiveNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int result =  findMaxConsecutiveNumbers(480);
        System.out.println(result);
    }

    private static int findMaxConsecutiveNumbers(int n){
        String binaryString =  Integer.toBinaryString(n);
        return result(binaryString);
    }


    private static int result(String input) {
        System.out.println(input);
        int max = 0;
        int counter = 0;
        for(int i=0;i<input.length();i++){

            if(input.charAt(i)=='1') {
                counter++;
                max = Math.max(max,counter);
            }
            else {
                counter=0;
            }
        }
        return max;
    }

}
