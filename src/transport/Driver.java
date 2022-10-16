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
        if (license==false) {
            System.out.println("Нужно получить права");
        }else {
            this.license = license;
        }
        if (experience <=3) {
            System.out.println("Недостаточно опыта");
        } else {
            this.experience = experience;
        }
        if (car != null) {
            this.car = car;
        }

    }

    public void start(){
        System.out.println(fullName + " заводит " + car.getBrand() +" " +car.getModel());
    }

    public void stop(){
        System.out.println(fullName + " глушит " + car.getBrand() +" " +car.getModel());
    }
    public void refuel(){
        System.out.println(fullName + " заправляет " + car.getBrand() +" " +car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }

    public T getCar() {
        return car;
    }
}
