package LabSix;

public class Motorcycle extends Vehicle {
    private boolean headlightsOn;

    public Motorcycle(String name, int productionYear, int gear, double speed, boolean brake, boolean headlightsOn) {
        super(name, productionYear, gear, speed, brake);
        this.headlightsOn = headlightsOn;
    }

    public String.toString() {
        String str = super.toString() + (headlightsOn ? "headlights on and ready" : "headlights off");
    }

    public void turnHeadlights(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

}
