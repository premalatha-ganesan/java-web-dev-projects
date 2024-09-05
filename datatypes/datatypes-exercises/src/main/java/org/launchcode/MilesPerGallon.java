package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles you have travelled : ");
        Double milesTravelled = input.nextDouble();
        System.out.println("Please enter the gallons who have consumed :" );
        Double gallonsConsumed = input.nextDouble();
        double milesPerGallon = milesTravelled / gallonsConsumed;
        System.out.println("Miles per gallon is : " + milesPerGallon);
    }
}
