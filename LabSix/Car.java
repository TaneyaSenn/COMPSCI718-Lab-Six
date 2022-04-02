package LabSix;

public class Car extends Vehicle {
    private boolean headlightsOn;
    private boolean wipersOn;

    public Car(String name, int productionYear, int gear, double speed, boolean brake, boolean headlightsOn, boolean wipersOn) {
        super(name, productionYear, gear, speed, brake);
        this.headlightsOn = headlightsOn;
        this.wipersOn = wipersOn;
    }

     public String.toString() {
        String str = super.toString() + (headlightsOn ? "headlights on and ready" : "headlights off") + (wipersOn ? "wipers are on and ready" : "wipers off");
    }

    public void turnHeadlights(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

    public void turnWindscreenWipers(boolean wipersOn) {
        this.wipersOn = wipersOn;
    }
}
