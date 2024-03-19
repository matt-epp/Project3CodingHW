package org.example.project3;

public class Task10 {
    //Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "banana", "orange", "mango", "mango", "peach"};
        for(int i = 1; i < fruits.length; i++){
            if (fruits[i].equals(fruits[i-1])){
                System.out.println(fruits[i]);
            }
        }
    }
}
