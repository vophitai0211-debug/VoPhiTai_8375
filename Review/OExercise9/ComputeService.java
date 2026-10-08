package Review.OExercise9;

import java.util.Date;
import java.util.Scanner;

public class ComputeService extends CloudService {

    private int cpuCores;
    private double runtimeHours;

    public ComputeService() {
    }

    public ComputeService(int cpuCores, double runtimeHours, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public double getRuntimeHours() {
        return runtimeHours;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public void setRuntimeHours(double runtimeHours) {
        this.runtimeHours = runtimeHours;
    }

    public static void setScanner(Scanner scanner) {
        CloudService.scanner = scanner;
    }

    @Override
    public void addService() {
        super.addService();
        System.out.print("Enter cpu cores: ");
        setCpuCores(scanner.nextInt());
        System.out.print("Enter runtime hours: ");
        setRuntimeHours(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void updateService() {
        super.updateService();
        System.out.print("Enter cpu cores: ");
        setCpuCores(scanner.nextInt());
        System.out.print("Enter runtime hours: ");
        setRuntimeHours(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cpu cores: " + getCpuCores()
                + "\nRuntime hours: " + getRuntimeHours());
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() * getMonthsUsed();
        double surcharge = 0;
        if (cpuCores >= 16) {
            surcharge += baseCost * 0.25;
        } else if (cpuCores >= 8) {
            surcharge += baseCost * 0.15;
        } else {
            surcharge += baseCost * 0.05;
        }
        double extraHoursCost = 0;
        if (runtimeHours > 200) {
            extraHoursCost = (runtimeHours - 200) * 0.50;
        }
        return baseCost + surcharge + extraHoursCost;
    }

}
