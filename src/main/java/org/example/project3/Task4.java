package org.example.project3;

public class Task4 {
    /*
    Create a 2D array of integers. Develop a program which will calculate the sum of
    even and odd numbers for that array.

     */
    public static void main(String[] args) {
        int[][] matrix = {{53, 76, 45}, {74, 34, 67}, {28, 64, 234}};
        int sumEven = 0;
        int sumOdd = 0;
        for(int[] i: matrix){
            for(int j : i){
                if(j % 2 == 0){
                   sumEven = sumEven + j;
                }
                else{
                    sumOdd = sumOdd + j;
                }
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
