package com.company;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static double toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            return (Math.round(kilometersPerHour/1.609));
        }
    }

    public static void printConversion(double kilometersPerHour) {
        int a = (int) toMilesPerHour(kilometersPerHour);
        if(a < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + a + " mi/h");
        }
    }
}
