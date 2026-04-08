package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Step #1
        double bobSalary = 65891.29;
        double garySalary = 78992.68;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + "\n");

        double carPrice = 30210.88;
        double truckPrice = 56720.99;

        System.out.println("The lowest vehicle price is " + Math.min(carPrice, truckPrice) + "\n");

        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * Math.sqrt(radiusOfCircle);

        System.out.println(areaOfCircle);

    }
}
