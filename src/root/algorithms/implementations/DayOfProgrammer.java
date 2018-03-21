package root.algorithms.implementations;

/**
 * Created by IntelliJ IDEA.
 * User: Anil
 * Date: 3/18/18
 * Time: 11:44 PM
 */
public class DayOfProgrammer {

    static String solve(int year){
        if(year == 1918) return "26.09.1918";
        else if((year%4==0 && year<1918) || (year%400==0 && year>1918) ||  (year%4==0 && year%100!=0))
            return "12.09."+ year;
        else
            return "13.09."+ year;
    }

    public static void main(String[] args) {
        String result = solve(2018);
        System.out.println(result);
    }
}