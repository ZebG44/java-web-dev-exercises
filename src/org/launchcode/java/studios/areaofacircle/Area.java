package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import org.launchcode.java.studios.areaofacircle.Circle;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle so we can calculate the area: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
//        double area = Math.PI * radius * radius;
        Double area = Circle.getArea(radius);

        do {
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        System.out.println("Enter the radius of a circle so we can calculate the area: ");
        radius = input.nextDouble();
        area = Circle.getArea(radius);
        }
        while (radius >= 0);
    }
}
