package Review.OExercise9;

import java.util.ArrayList;

public class CloudServiceArrayList {

    private ArrayList<CloudService> services = new ArrayList<>();

    public void addServiceToArrayList(CloudService service) {
        services.add(service);
    }

    public CloudService findServiceById(String id) {
        for (CloudService cloudService : services) {
            if (cloudService.getId().equals(id)) {
                return cloudService;
            }
        }
        return null;
    }

    public void updateServiceById(String id) {
        CloudService cloudService = findServiceById(id);
        if (cloudService != null) {
            cloudService.updateService();
            System.out.println("Update complete");
        } else {
            System.out.println("Can't find id to update");
        }
    }

    public void deleteServiceById(String id) {
        CloudService cloudService = findServiceById(id);
        if (cloudService != null) {
            services.remove(cloudService);
            System.out.println("Delete complete");
        } else {
            System.out.println("Can't find id to delete");
        }
    }

    public void displayAllServices() {
        if (services.isEmpty()) {
            System.out.println("No services available");
            return;
        }
        for (CloudService cloudService : services) {
            cloudService.displayDetails();
            System.out.printf("Calculated Monthly Cost: %.2f\n", cloudService.calculateMonthlyCost());
        }
    }

    public void displayActiveServices() {
        boolean found = false;
        for (CloudService cloudService : services) {
            if (cloudService.isIsActive()) {
                cloudService.displayDetails();
                System.out.printf("Calculated Monthly Cost: %.2f\n", cloudService.calculateMonthlyCost());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No active services found.");
        }
    }

    public double findHighestMonthlyCost() {
        if (services.isEmpty()) {
            return 0.0;
        }
        double highest = services.get(0).calculateMonthlyCost();
        for (CloudService cloudService : services) {
            double cost = cloudService.calculateMonthlyCost();
            if (cost > highest) {
                highest = cost;
            }
        }
        return highest;
    }
}
