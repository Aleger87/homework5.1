package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private float engineVolume;
    public Set<Driver> drivers = new HashSet<>();
    public Set<Sponsor> sponsors = new HashSet<>();
    public Set<Mechanic> mechanics = new HashSet<>();

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "defoult";
        } else {
            this.brand = brand;
        }if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "defoult";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        }else {
            this.engineVolume = engineVolume;
        }
    }



    public abstract boolean diagnostics();
    public abstract void startMovement();

    public abstract void finishMovement();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void typeTransport();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
