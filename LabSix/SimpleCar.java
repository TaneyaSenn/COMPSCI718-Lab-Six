package LabSix;

import java.util.Date;

public class SimpleCar {
    int year, odometer, engine;
    String make, model, bodyType, transmission;
    double price;
    Date wofExpiry;


    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getOdometer() {
        return odometer;
    }

    public int getEngine() {
        return engine;
    }

    public Date getWofExpiry() {
        return wofExpiry;
    }

    public double getPrice() {
        return price;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setWofExpiry(Date wofExpiry) {
        this.wofExpiry = wofExpiry;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
