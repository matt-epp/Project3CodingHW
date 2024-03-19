package org.example.project3;

public class Task3 {
    /*
    Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.

     */
    public static void main(String[] args) {
        int[][] matrix = {{53, 76, 45}, {74, 34, 67}, {28, 64, 234}};
        for (int[] i : matrix) {
            for (int j : i) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
