package exercises;

import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args) {
        double miles;
        double gas;
        double MPG;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        miles = input.nextDouble();
        System.out.println("Enter number of gallons of gas used: ");
        gas = input.nextDouble();
        input.close();

        MPG = miles / gas;

        System.out.println("The vehicle drove at " + MPG + " miles per gallon.");
    }
}
