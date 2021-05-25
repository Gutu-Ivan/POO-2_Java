import java.awt.Color;
import java.util.HashMap;

public class Car {
    private Driver driver;
    private Tank tank;
    private String brand;
    private Color color;
    private Integer speed;
    private Integer maxSpeed;
    private Integer gear;
    private Integer maxGear;

    public Car()
    {
        this.brand = "Audi";
        this.color = Color.white;
        this.speed = 0;
        this.maxSpeed = 300;
        this.gear = 0;
        this.maxGear = 7;

        Driver driver = new Driver();
        this.driver = driver;

        Tank tank = new Tank();
        this.tank = tank;
    }

    public Car(String brand, Color color, Integer speed, Integer maxSpeed, Integer gear, Integer maxGear)
    {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.gear = gear;
        this.maxGear = maxGear;

        Driver driver = new Driver();
        this.driver = driver;

        Tank tank=new Tank();
        this.tank = tank;
    }

    public Driver getDriver() {return this.driver;}
    public void setDriver(Driver driver) {this.driver = driver;}

    public Tank getTank() {return this.tank;}
    public void setTank(Tank tank) {this.tank = tank;}

    public String GetBrand() {return this.brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public Color getColor() {return this.color;}
    public void setColor(Color color) {this.color = color;}

    public Integer getSpeed() {return this.speed;}
    public void setSpeed(Integer speed) {this.speed = speed;}

    public Integer getGear() {return this.gear;}
    public void setGear(Integer gear) {this.gear = gear;}

    public Integer getMaxSpeed() {return this.maxSpeed;}
    public void setMaxSpeed(Integer maxSpeed) {this.maxSpeed = maxSpeed;}

    public Integer getMaxGear() {return this.maxGear;}
    public void setMaxGear(Integer maxGear) {this.maxGear = maxGear;}

    public void raiseGear() {
        gear++;
        if(gear > maxGear)
            gear--;

    }
    public void reduceGear() {
        gear--;
        if(gear < 0)
            gear++;
    }

    public void Acceleration(Integer addSpeed){
        speed += addSpeed;
        if (speed > maxSpeed)
            speed = maxSpeed;
    }
    public void Decceleration(Integer reduceSpeed){
        speed -= reduceSpeed;
        if(speed < 0)
            speed = 0;
    }
    public void Stop() {
        speed=0;
        gear=0;
    }

    public String getCarColor() {
        if(color.equals(Color.BLACK))
            return "black";
        else if(color.equals(Color.WHITE))
            return "white";
        else
            return "Unknown Color";
    }

    @Override
    public String toString()
    {
        String speed = "Date speed: " + this.speed.toString() + " km/hour. ";
        String gear = "Date gear: " + this.gear.toString() + ". ";
        String tank = "Date tank: " + this.tank.toString() + " l.";
        return  speed + gear + tank;
    }

}
