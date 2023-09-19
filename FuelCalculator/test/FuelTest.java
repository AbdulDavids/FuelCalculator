import fuelcalculator.DieselVehicle;
import fuelcalculator.PetrolVehicle;
import fuelcalculator.Vehicle;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FuelTest {

    @Test
    public void testCalculateFuelCost() {
        Vehicle vehicle = new Vehicle(6.5, "Diesel");
        double fuelCost = vehicle.calculateFuelCost(200); // 200 kilometers
        assertEquals(325.13, fuelCost, 0.01); // Expected fuel cost in Rands 

        vehicle = new Vehicle(7.8, "Petrol");
        fuelCost = vehicle.calculateFuelCost(150); // 150 kilometers
        assertEquals(289.45, fuelCost, 0.01);
    }
    
    
    @Test
    public void testCalculateFuelCostDiesel() {
        DieselVehicle dieselVehicle = new DieselVehicle(6.5);
        double fuelCost = dieselVehicle.calculateFuelCost(200); // 200 kilometers
        assertEquals(325.13, fuelCost, 0.01); // Expected fuel cost in Rands
    }
    
    
    @Test
    public void testCalculateFuelCostPetrol() {
        PetrolVehicle petrolVehicle = new PetrolVehicle(7.8);
        double fuelCost = petrolVehicle.calculateFuelCost(150); // 150 kilometers
        assertEquals(289.45, fuelCost, 0.01); // Expected fuel cost in Rands 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

