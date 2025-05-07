package at.cengizhan.Test;

import java.util.ArrayList;
import java.util.List;

public class Dealer{

    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    void printAllVehicles(){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getId() + ": "+ vehicle.getName());
        }
    }

}

