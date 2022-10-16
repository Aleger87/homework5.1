package transport;

import java.util.Arrays;

public class Cars extends Transport  implements Competing{
    private Transport[] cars;

    public Cars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
        cars = new Transport[0];
    }


    public void addCars (Transport car){
        this.cars = Arrays.copyOf(getCars(),  getCars().length+1);
        this.cars[this.cars.length-1] = car;
    }

    @Override
    public void startMovement() {
        System.out.println("Завести машину");
    }

    @Override
    public void finishMovement() {
        System.out.println("Заглушить машину");
    }

    @Override
    public void pitStop() {
        System.out.println("Сменить резину");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость");
    }

    public Transport[] getCars() {
        return cars;
    }
}
