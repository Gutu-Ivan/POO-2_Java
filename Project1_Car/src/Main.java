import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Car auto = new Car("Toyota", Color.black, 45, 260, 2, 6);
        System.out.println("Driver: " + auto.getDriver().toString());
        System.out.println("Car: " + auto.GetBrand() + ". Color: " + auto.getCarColor());
        System.out.println(auto.getTank().toString() + auto.getTank().toMax());
        TestDrive.Auto(auto);
    }
}
