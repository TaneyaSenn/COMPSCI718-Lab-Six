package LabSix;

public class Vehicle {

    protected String name;
    protected int productionYear, gear;
    protected double speed;
    protected boolean brake;

    public Vehicle(String name, int productionYear, int gear, double speed, boolean brake) {
        this.name = name;
        this.productionYear = productionYear;
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    @Override
    public String toString() {
//        return getClass()
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", gear=" + gear +
                ", speed=" + speed +
                ", brake=" + brake +
                '}';
    }

    public void changeGear(int gear) {
    this.gear = gear;
    }

    public void accelerate(double speed) {
        this.speed = speed;
    }

    public void setBrake(boolean brake) {
        this.brake = brake;
    }
}
