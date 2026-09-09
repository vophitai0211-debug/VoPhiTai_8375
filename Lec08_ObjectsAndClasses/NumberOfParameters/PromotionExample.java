package Lec08_ObjectsAndClasses.NumberOfParameters;

public class PromotionExample {

    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        PromotionExample obj = new PromotionExample();
        obj.display(5); // Calls display(int)
        obj.display(5.0); // Calls display(double)
        obj.display(5L); // Calls display(double)
    }
}
