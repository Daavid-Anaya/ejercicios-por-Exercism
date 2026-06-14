class NeedForSpeed {
    private int distanceDriven = 0;
    private int remainingBattery = 100;
    public int speed = 0;
    public int batteryDrain = 0;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (remainingBattery < batteryDrain) ? true : false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
             distanceDriven += speed;
             remainingBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance = 0;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    
    public boolean canFinishRace(NeedForSpeed car) {
        return (distance <= ((100 / car.batteryDrain ) * car.speed)) ? true : false;
    }
}
