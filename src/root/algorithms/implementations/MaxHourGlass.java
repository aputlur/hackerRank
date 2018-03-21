package root.algorithms.implementations;

import java.util.Arrays;


public class MaxHourGlass {

    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = (int)(Math.random()*5);
            }
        }
        print(arr);
      int max =   maxHourGlass(arr);
        System.out.println("Max hour-glass -> "+ max);
    }


    private static int maxHourGlass(int[][] input){

        int[] sum = new int[16];
        int counter = 0;
        for(int o=0;o<4;o++){

            for(int i=0;i<4;i++){

               sum[counter] = input[o][i] + input[o][i+1] + input[o][i+2]
                              + input[o+1][i+1]
                              + input[o+2][i] + input[o+2][i+1] + input[o+2][i+2];
               counter++;
            }
        }
        Arrays.sort(sum);
        return sum[15];
    }




    private static void print(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}
