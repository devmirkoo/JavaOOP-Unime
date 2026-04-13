

public class Automobile {
    // Costants
    private final double MAX_POWER = 5.0;
    private final double FUEL_CONSUMPTION_RATE = 0.1;
    private final double BRAKE_POWER = 8.0;
    private final double FRICTION = 0.5;

    private double speed;
    private double fuel;
    private String license;

    // Public Methods
    public void accelerate(double pedalPressure) {
        if (this.fuel > 0) {
            double acceleration = MAX_POWER * pedalPressure;
            this.speed += acceleration;
            this.fuel -= pedalPressure * FUEL_CONSUMPTION_RATE;
            if (this.fuel < 0) this.fuel = 0;
        } else {
            System.out.println("Serbatoio vuoto!");
        }
    }

    public void decelerate(double brakePressure) {
        double deceleration = (BRAKE_POWER * brakePressure) + FRICTION;

        this.speed -= deceleration;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }


    // Getter & Setter
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public double getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }
}
