package transport;


public class Car extends Transport  implements Competing{

    public enum BodyType {SEDAN, HATCHBACK, COUPE, WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN};

    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.println( "Завести машину " + getBrand());
    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void finishMovement() {
        System.out.println("Заглушить машину " + getBrand());
    }

    @Override
    public void typeTransport() {
        if (bodyType == null) {
            System.out.println("Не определено");
        }else{
            System.out.println("Тип кузова " +bodyType);
        }
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

}
