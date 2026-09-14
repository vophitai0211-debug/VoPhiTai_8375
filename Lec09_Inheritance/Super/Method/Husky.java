
package Lec09_Inheritance.Super.Method;

public class Husky extends Dog{
    public void information(){
        super.displayPrice();
        System.out.println("Husky's is price 1500$");
    }
}
