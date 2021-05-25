
public class Tank {
    Double maxVolume;
    Double currentVolume;

    public Tank() {
        this.currentVolume = 70.0;
        this.maxVolume = 70.0;
    }

    public Tank(double currentVolume, double maxVolume)
    {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public void fillTank(double a) {
        if ((a + currentVolume) > maxVolume)
            currentVolume = maxVolume;
        else currentVolume = currentVolume + a;
    }

    public void emptyTank(double a) {
        if ((currentVolume - a) < 0)
            currentVolume = 0.0;
        else currentVolume = currentVolume - a;
    }

    public String toMax() {
        String max = "Max volume is: " + this.maxVolume.toString() + " l.";
        return  max;
    }

    @Override
    public String toString() {
        String current = "Current volume is: " + this.currentVolume.toString() + " l. ";
        return  current;
    }
}
