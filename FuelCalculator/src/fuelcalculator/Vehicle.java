/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuelcalculator;


// Base class for vehicle
public class Vehicle {
    protected double fuelEfficiency; // Liters per 100 kilometers
    protected String fuelType; // Diesel or Petrol

    public Vehicle(double fuelEfficiency, String fuelType) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelType = fuelType;
    }

    // Calculate fuel cost for the given distance
    public double calculateFuelCost(double distance) {
        double fuelPrice = getFuelPrice();
        double litersRequired = (fuelEfficiency / 100) * distance;
        return litersRequired * fuelPrice;
    }

    // Get fuel price based on fuel type
    private double getFuelPrice() {
        if ("Diesel".equalsIgnoreCase(fuelType)) {
            return 25.01; // diesel price per liter (Rands)
        } else if ("Petrol".equalsIgnoreCase(fuelType)) {
            return 24.74; // petrol price per liter (Rands)
        } else {
            return 0.00; // Default to zero for unknown fuel type/electric
        }
    }
}


//=============================================================================

