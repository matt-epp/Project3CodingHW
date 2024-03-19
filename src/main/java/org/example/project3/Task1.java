package org.example.project3;
/*
1.Create a program that uses an array to store a list of temperatures for a week,
 and then uses a loop to find the highest and lowest temperature for the week.
 */
public class Task1 {
    public static void main(String[] args) {
        double[] temps = {53.6, 76.3, 45.0, 74.1, 34.5, 67.2, 34.2};
        double high=temps[0];
        double low=temps[0];
        for(double t: temps){
            if(high<t){
                high=t;
            }
            if(low>t) {
                low = t;
            }
        }
        System.out.println(high);
        System.out.println(low);
    }
}
