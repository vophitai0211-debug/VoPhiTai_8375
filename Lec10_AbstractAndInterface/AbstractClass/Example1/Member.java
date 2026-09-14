package Lec10_AbstractAndInterface.AbstractClass.Example1;

public class Member extends MonthlyTasks {

    int memberID;

    @Override
    void makeMonthlyReport() {
        System.out.println("Step 1: Get form from Report folder"
                + "\nStep 2: Fill information"
                + "\nStep 3: Upload to MemberReport folder");
    }
}
