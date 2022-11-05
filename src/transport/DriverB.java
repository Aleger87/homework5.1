package transport;

public class DriverB extends Driver<Car>{
    public DriverB(String fullName, boolean license, int experience, Car car) {
        super(fullName, license, experience, car);
    }


    @Override
    public void setLicense(boolean license) {
        super.setLicense(license);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void refuel() {
        super.refuel();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public boolean isLicense() {
        return super.isLicense();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public Car getCar() {
        return super.getCar();
    }
}
