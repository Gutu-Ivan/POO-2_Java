public class TestDrive {
    public static void Auto(Car auto)
    {
        Tank tk = auto.getTank();
        System.out.println(auto.toString());
        auto.Acceleration(100);
        auto.raiseGear();
        auto.raiseGear();
        auto.raiseGear();
        System.out.println(auto.toString());
        tk.emptyTank(10);
        auto.setTank(tk);
        auto.Decceleration(30);
        auto.reduceGear();
        System.out.println(auto.toString());
        auto.Acceleration(50);
        auto.raiseGear();
        auto.raiseGear();
        System.out.println(auto.toString());
        auto.Decceleration(10);
        auto.reduceGear();
        System.out.println(auto.toString());
        auto.Decceleration(40);
        auto.reduceGear();
        System.out.println(auto.toString());
        auto.Stop();
        System.out.println(auto.toString());
        tk.fillTank(15);
        auto.setTank(tk);
        auto.Acceleration(50);
        auto.raiseGear();
        auto.raiseGear();
        System.out.println(auto.toString());
        auto.getColor();
    };
}
