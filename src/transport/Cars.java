package transport;

import java.util.Arrays;

public class Cars extends Transport {
    private Transport[] cars;

    public Cars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
        cars = new Transport[0];
    }


    @Override
    public void startMovement() {

    }

    @Override
    public void finishMovement() {

    }
    public void addCars (Transport car){
        this.cars = Arrays.copyOf(getCars(),  getCars().length+1);
        this.cars[this.cars.length-1] = car;
    }

    public Transport[] getCars() {
        return cars;
    }
}
