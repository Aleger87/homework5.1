import transport.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8", 3.5f);
        audi.startMovement();
        audi.finishMovement();
        System.out.println(audi.getBrand());
        System.out.println(audi.getModel());
        System.out.println(audi.getEngineVolume());
        System.out.println(audi.toString());


        Car bmw = new Car("BMW", "Z4", 3.5f);

        Car renault = new Car("Renault", "Logan", 1.6f);

        Car mercedes = new Car("Mercedes", "E200", 3.2f);


        Bus lias = new Bus("Лиаз", null, 3);

        Bus nifaz = new Bus("Нифаз", null, 3);

        Bus kamaz = new Bus("Камаз", "А355", 4);

        Bus paz  = new Bus("ПАЗ", null, 3);


        Truck man = new Truck("Ман", null, 6);

        Truck scania = new Truck("Скания", null, 6);

        Truck isyzy = new Truck("Исузу", null, 6);

        Truck luidor = new Truck("Луидор", null, 6);


        DriverB alex = new DriverB("Алексей Алексеевич Алексеев", true, 5, bmw);
        System.out.println();
        System.out.println(alex.getFullName());
        System.out.println(alex.isLicense());
        System.out.println(alex.getExperience());
        alex.start();
        alex.refuel();
        alex.stop();
        System.out.println("Водитель " + alex.getFullName() + " управляет автомобилем " + alex.getCar().getBrand()+ " и будет участвовать в заезде");

    }


}