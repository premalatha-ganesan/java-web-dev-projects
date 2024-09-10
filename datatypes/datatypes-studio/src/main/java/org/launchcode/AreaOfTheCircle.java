package org.launchcode;

import java.util.Scanner;

public class AreaOfTheCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        Double radius = input.nextDouble();
        if(radius.hasNextDouble()){
            Double areaOfTheCircle = Circle.getArea(radius);
        }

        System.out.println("The area of the circle is : " + areaOfTheCircle);
    }
}
