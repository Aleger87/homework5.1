package transport;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class Car extends Transport  implements Competing{

   /* ArrayList<Driver> drivers = new ArrayList<>();
    ArrayList<Sponsor> sponsors = new ArrayList<>();
    ArrayList<Mechanic> mechanics = new ArrayList<>();*/
    public enum BodyType {SEDAN, HATCHBACK, COUPE, WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;};

    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }


    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public void addMechanic(Mechanic... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "drivers=" +  drivers +
                ", sponsors=" + sponsors +
                ", mechanics=" + mechanics +
                '}';
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
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
