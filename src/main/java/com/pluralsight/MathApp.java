package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Step #1
        double bobSalary = 65891.29;
        double garySalary = 78992.68;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary between Gary and Bob is " + highestSalary + "\n");

        double carPrice = 30210.88;
        double truckPrice = 56720.99;

        System.out.println("The lowest price between the two vehicles is " + Math.min(carPrice, truckPrice) + "\n");

        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);

        System.out.println(String.format("%.2f", areaOfCircle) + "\n");

        double squareRoot = 5.0;
        squareRoot = Math.sqrt(squareRoot);

        System.out.println("The square root is " + String.format("%.2f", squareRoot) + "\n");

        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        int distanceOne = x2 - x1;
        int distanceTwo = y2 - y1;

        System.out.println("The distance between the two points is " + String.format("%.2f", Math.sqrt(Math.pow(distanceOne, 2) + Math.pow(distanceTwo, 2))) + "\n");

        double negativeValue = -3.8;

        System.out.println("The absolute value is " + Math.abs(negativeValue) + "\n");

        double randomValue = Math.random();

        System.out.println("The random value is between 0 and 1 is " + String.format("%.2f", randomValue) + "\n");

        int minuteInHour = 60;
        int hoursPerDay = 24;
        int minutePerDay = minuteInHour * hoursPerDay;
        int millisecondPerDay = minutePerDay * 60 * 1000;

        System.out.println("There are " + minutePerDay + " minutes in a day.\n");
        System.out.println("There are " + millisecondPerDay + " milliseconds in a day.\n");
        System.out.println("There are " + millisecondPerDay * 24 + " milliseconds in  24 days.\n");

    }
}
