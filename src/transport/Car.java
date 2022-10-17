package transport;


public class Car extends Transport  implements Competing{

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startMovement() {
        System.out.println( "Завести машину " + getBrand());
    }

    @Override
    public void finishMovement() {
        System.out.println("Заглушить машину " + getBrand());
    }

    @Override
    public void pitStop() {
        System.out.println("Сменить резину" +getBrand());
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшее время...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость....");
    }

}
