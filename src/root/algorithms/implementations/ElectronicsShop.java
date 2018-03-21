package root.algorithms.implementations;

import java.util.Arrays;
import java.util.Collections;

public class ElectronicsShop {


    public static void main(String[] args) {

        int amount = 10;
        Integer[] m = {1,2}; //keyboard
        Integer[] n = {2,4,8}; //Mouse

        bestSolution(m,n,amount);
    }


    //Best Solution

    static int bestSolution(Integer[] keyboards, Integer[] pendrives, int s){


           Arrays.sort(keyboards,Collections.reverseOrder());
            Arrays.sort(pendrives);//Ascending order

            int max = -1;
            for(int i = 0, j = 0; i < keyboards.length; i++){
                for(; j < pendrives.length; j++){
                    if(keyboards[i]+pendrives[j] > s) break;
                    if(keyboards[i]+pendrives[j] > max)
                        max = keyboards[i]+pendrives[j];
                }
            }
            System.out.println(max);
        return max;
    }


    static int getMoneySpent(int[] keyboards, int[] drives, int s){

        int max = -1;
        for(int k=0;k<drives.length;k++){

            for(int j=0;j<keyboards.length;j++){

                int newMax =  drives[k] + keyboards[j];
                if(newMax <= s){
                    max = Math.max(max,newMax);
                }
            }
        }
        return max;
    }
}
