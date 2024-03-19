package org.example.project3;

public class Task2 {
    /*
    2.Create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array.

     */
    public static void main(String[] args) {
        int[] ints = {53, 76, 45, 74, 34, 67, 28};
        int sum = 0;
        for(int i: ints){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
