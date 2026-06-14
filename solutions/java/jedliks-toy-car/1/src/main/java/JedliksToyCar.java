public class JedliksToyCar {
    private int batteries = 100;
    private int totalDistance = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        return (batteries == 0) ? "Battery empty" : "Battery at " + batteries + "%";
    }

    public void drive() {
        if (batteries > 0) {
            totalDistance += 20;
            batteries -= 1;
        }
        
    }
}
