package org.example.project3;

public class Task6 {
    // Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        int num = 57;
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
