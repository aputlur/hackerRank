package root.algorithms.implementations;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/6/18
 * Time: 1:30 PM
 */
public class TipCalculation {


        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
            double meal_cost = 12.0;
            int tip_percent = 20;
            int tax_percent = 8;

            float signum = Math.signum(0);
            System.out.println("signum : "+ signum);
            System.out.println((20 / 100.0));
            double tip = meal_cost * (tip_percent/100.0);
            double tax = meal_cost * (tax_percent/100.0);

            System.out.println("tip : " + tip + " tax : "+ tax);
            long totalCost = Math.round(meal_cost + tip + tax);
            System.out.println("The total meal cost is "+ totalCost + " dollars");


        }
    }
