package root.algorithms.implementations;

public class CountingValleys {

    public static void main(String[] args) {
        String str = "UDDDUDUU";
        int result = countValleys(str);
        System.out.println("Number Of Valleys : "+ result);
    }

    private static int countValleys(String str) {

        int numberOfValleys = 0;
        int currentLevel = 0;

        for(Character step : str.toCharArray()){

            if(step=='D') currentLevel--;
            if(step=='U') currentLevel++;

            if(currentLevel ==0 && step=='U') numberOfValleys++;
        }
        return numberOfValleys;
    }
}
