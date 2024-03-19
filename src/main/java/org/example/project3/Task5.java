package org.example.project3;

public class Task5 {
    //Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {

        int x = 10;
        int y = 55;

        x = y + x;
        y = x - y;
        x = x - y;

        System.out.println("X is " + x);
        System.out.println("Y is " + y);

    }
}
