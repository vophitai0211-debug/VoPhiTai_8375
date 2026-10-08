package Review.OExercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class CloudService implements ICloudService {

    private String id;
    private double baseMonthlyFee;
    private Date startDate;
    private boolean isActive;
    private int monthsUsed;
    public static Scanner scanner = new Scanner(System.in);

    public CloudService() {
    }

    public CloudService(String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }

    public String getId() {
        return id;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    @Override
    public void addService() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter id: ");
            setId(scanner.nextLine());
            System.out.print("Enter base monthly fee: ");
            setBaseMonthlyFee(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Enter start date: ");
            setStartDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter active: ");
            setIsActive(Boolean.parseBoolean(scanner.nextLine()));
            System.out.print("Enter months used: ");
            setMonthsUsed(scanner.nextInt());
            scanner.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateService() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter base monthly fee: ");
            setBaseMonthlyFee(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Enter start date: ");
            setStartDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter active: ");
            setIsActive(Boolean.parseBoolean(scanner.nextLine()));
            System.out.print("Enter months used: ");
            setMonthsUsed(scanner.nextInt());
            scanner.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = (startDate != null) ? sdf.format(startDate) : "N/A";
        System.out.println("Id: " + getId()
                + "\nBase monthly fee: " + getBaseMonthlyFee()
                + "\nStart date: " + formattedDate
                + "\nIs active: " + (isActive ? "Yes" : "No")
                + "\nMonths used: " + getMonthsUsed());
    }

}
