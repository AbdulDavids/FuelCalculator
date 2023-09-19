/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuelcalculator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FuelCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select the vehicle type (1 for Diesel, 2 for Petrol)
        System.out.print("Select vehicle type (1 for Diesel, 2 for Petrol): ");
        int vehicleType = scanner.nextInt();

        double fuelEfficiency;

        // if diesel
        if (vehicleType == 1) {
            try {
                // Prompt for and read the diesel vehicle's fuel efficiency (L/100km)
                System.out.print("Enter diesel vehicle's fuel efficiency (L/100km): ");
                fuelEfficiency = scanner.nextDouble();

                DieselVehicle dieselVehicle = new DieselVehicle(fuelEfficiency);

                System.out.print("Enter the distance of the trip (kilometers): ");
                double distance = scanner.nextDouble();

                // Calculate and display the fuel cost for the trip
                double fuelCost = dieselVehicle.calculateFuelCost(distance);
                System.out.println("Fuel Cost for the Trip: R" + fuelCost);

            } catch (Exception e) {
                System.out.println("Invalid input or calculation error");
            }

            //petrol
        } else if (vehicleType == 2) {
            try {
                // Prompt for and read the petrol vehicle's fuel efficiency (L/100km)
                System.out.print("Enter petrol vehicle's fuel efficiency (L/100km): ");
                fuelEfficiency = scanner.nextDouble();

                PetrolVehicle petrolVehicle = new PetrolVehicle(fuelEfficiency);

                System.out.print("Enter the distance of the trip (kilometers): ");
                double distance = scanner.nextDouble();

                // Calculate and display the fuel cost for the trip
                double fuelCost = petrolVehicle.calculateFuelCost(distance);
                System.out.println("Fuel Cost for the Trip: R" + fuelCost);
            } catch (Exception e) {
                System.out.println("Invalid input or calculation error");
            }
        } else {
            // Handle invalid vehicle type selection
            System.out.println("Invalid vehicle type selection.");
        }

        scanner.close();
    }
}
//--------------------------------------------------------------------------------------
