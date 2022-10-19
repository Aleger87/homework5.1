import transport.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8", 3.5f, Car.BodyType.MINIVAN);
        audi.startMovement();
        audi.finishMovement();
        System.out.println(audi.getBrand());
        System.out.println(audi.getModel());
        System.out.println(audi.getEngineVolume());
        System.out.println(audi.toString());
        audi.typeTransport();


        Car bmw = new Car("BMW", "Z4", 3.5f, Car.BodyType.SEDAN);

        Car renault = new Car("Renault", "Logan", 1.6f, Car.BodyType.COUPE);

        Car mercedes = new Car("Mercedes", "E200", 3.2f, Car.BodyType.SEDAN);


        Bus lias = new Bus("Лиаз", null, 3, Bus.Classification.ESPECIALLY_SMALL);
        lias.typeTransport();

        Bus nifaz = new Bus("Нифаз", null, 3, Bus.Classification.SMALL);

        Bus kamaz = new Bus("Камаз", "А355", 4, Bus.Classification.LARGE);

        Bus paz  = new Bus("ПАЗ", null, 3, Bus.Classification.SMALL);


        Truck man = new Truck("Ман", null, 6, Truck.Tonnage.N3);
        man.typeTransport();
        Truck scania = new Truck("Скания", null, 6, Truck.Tonnage.N1);

        Truck isyzy = new Truck("Исузу", null, 6, Truck.Tonnage.N3);

        Truck luidor = new Truck("Луидор", null, 6, Truck.Tonnage.N2);


        DriverB alex = new DriverB("Алексей Алексеевич Алексеев", true, 5, bmw);
        System.out.println();
        System.out.println(alex.getFullName());
        System.out.println(alex.isLicense());
        System.out.println(alex.getExperience());
        alex.start();
        alex.refuel();
        alex.stop();
        System.out.println("Водитель " + alex.getFullName() + " управляет автомобилем " + alex.getCar().getBrand()+ " и будет участвовать в заезде" );



    }


}