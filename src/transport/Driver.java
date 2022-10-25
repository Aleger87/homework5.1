package transport;

public abstract class Driver<T extends Transport & Competing> {
    private String fullName;
    private boolean license;
    private int experience;

    private T car;

    public Driver(String fullName, boolean license, int experience, T car) {
        if (fullName == null || fullName.isBlank() || fullName.isEmpty()) {
            throw new NullPointerException("Укажите имя");
        }else {
            this.fullName = fullName;
        }
        if (experience <=3) {
            System.out.println("Недостаточно опыта");
        } else {
            this.experience = experience;
        }
        if (car != null) {
            this.car = car;
        }
        setLicense(license);

    }

    public void setLicense(boolean license) {
        if (!license) {
            throw new IllegalArgumentException("Необходимо получить права");
        }
                this.license = license;

    }

    public void start(){
        car.startMovement();
        System.out.println(fullName + " заводит " + car.getBrand() +" " +car.getModel());
    }

    public void stop(){
        car.finishMovement();
        System.out.println(fullName + " глушит " + car.getBrand() +" " +car.getModel());
    }
    public void refuel(){
        System.out.println(fullName + " заправляет " + car.getBrand() +" " +car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isLicense() {
        if (!license) {
            throw new RuntimeException("Прав нет, водитель " + getFullName() + " не будет участвовать в заезде" );
        }
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public T getCar() {
        return car;
    }
}
