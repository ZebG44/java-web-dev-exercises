package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the gallons of gas consumed while driving: ");
        double gas = input.nextDouble();
        input.close();

        double milesPerGallon = miles/gas;
        System.out.println("Your vehicle's fuel efficiency is: " + milesPerGallon + " mpg.");
    }
}
