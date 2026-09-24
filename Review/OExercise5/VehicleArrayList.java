package Review.OExercise5;

import java.util.ArrayList;

public class VehicleArrayList {
    private ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleArrayList.add(vehicle);
    }

    public void updateVehicle(String id) {
        Vehicle vehicle = findVehicleById(id);

        if (vehicle != null) {
            vehicle.updateVehicleInfo();
            System.out.println("Update complete");
        } else {
            System.out.println("Can't find id");
        }
    }

    public void deleteVehicleById(String id) {
        Vehicle vehicle = findVehicleById(id);

        if (vehicle != null) {
            vehicleArrayList.remove(vehicle);
            System.out.println("Delete complete");
        } else {
            System.out.println("Can't find id");
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleArrayList) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }

        return null;
    }

    public void displayAllVehicles() {
        if (vehicleArrayList.isEmpty()) {
            System.out.println("No vehicles");
            return;
        }

        for (Vehicle vehicle : vehicleArrayList) {
            vehicle.displayInfo();
            System.out.println("--------------------");
        }
    }

    public double calculateTotalRentalCost() {
        double total = 0;

        for (Vehicle vehicle : vehicleArrayList) {
            total += vehicle.calculateRentalCost();
        }

        return total;
    }

    public void countVehicleByType() {
        int countCar = 0;
        int countMotorbike = 0;

        for (Vehicle vehicle : vehicleArrayList) {
            if (vehicle instanceof Car) {
                countCar++;
            }

            if (vehicle instanceof Motorbike) {
                countMotorbike++;
            }
        }

        System.out.println("The number of Cars: " + countCar);
        System.out.println("The number of Motorbikes: " + countMotorbike);
    }
}
