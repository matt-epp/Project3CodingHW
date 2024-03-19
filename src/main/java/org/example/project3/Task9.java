package org.example.project3;

public class Task9 {
    //Write a java program to find the second largest number in the array
    public static void main(String[] args) {
        int[] ints = {53, 76, 45, 57, 34, 67, 28};
        int largest = ints[0];
        int secondLargest = ints[0];
        for(int i : ints){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }
            if(i < largest && i > secondLargest)
                secondLargest = i;
        }
        System.out.println(secondLargest);
    }
}
