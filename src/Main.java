import transport.*;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


        Car audi = new Car("Audi", "A8", 3.5f, Car.BodyType.MINIVAN);
       /* audi.startMovement();
        audi.finishMovement();
        System.out.println(audi.getBrand());
        System.out.println(audi.getModel());
        System.out.println(audi.getEngineVolume());
        System.out.println(audi.toString());
        audi.typeTransport();*/




        Car bmw = new Car("BMW", "Z4", 3.5f, Car.BodyType.SEDAN);

        Car renault = new Car("Renault", "Logan", 1.6f, Car.BodyType.COUPE);

        Car mercedes = new Car("Mercedes", "E200", 3.2f, Car.BodyType.SEDAN);


        Bus lias = new Bus("Лиаз", null, 3, Bus.Classification.ESPECIALLY_SMALL);
        //lias.typeTransport();

        Bus nifaz = new Bus("Нифаз", null, 3, Bus.Classification.SMALL);

        Bus kamaz = new Bus("Камаз", "А355", 4, Bus.Classification.LARGE);

        Bus paz  = new Bus("ПАЗ", null, 3, Bus.Classification.SMALL);


        Truck man = new Truck("Ман", null, 6, Truck.Tonnage.N3);
        //man.typeTransport();
        Truck scania = new Truck("Скания", null, 6, Truck.Tonnage.N1);

        Truck isyzy = new Truck("Исузу", null, 6, Truck.Tonnage.N3);

        Truck luidor = new Truck("Луидор", null, 6, Truck.Tonnage.N2);

        /*service(audi, bmw, renault, mercedes,
                lias, nifaz, kamaz, paz,
                man, scania, isyzy, luidor);*/

        /*addCars(audi, bmw, renault, mercedes,
                lias, nifaz, kamaz, paz,
                man, scania, isyzy, luidor);*/

        DriverB alex = new DriverB("Алексей Алексеевич Алексеев", true, 5, bmw);
       /* System.out.println();
        System.out.println(alex.getFullName());
        System.out.println(alex.isLicense());
        System.out.println(alex.getExperience());
        alex.start();
        alex.refuel();
        alex.stop();
        System.out.println("Водитель " + alex.getFullName() + " управляет автомобилем " + alex.getCar().getBrand()+ " и будет участвовать в заезде" );*/

        bmw.addDriver(alex);

        Sponsor sponsor = new Sponsor("John", 5_000_000.00f);
        Sponsor sponsor1 = new Sponsor("Adam", 5_000_000.00f);
        Sponsor sponsor2 = new Sponsor("Bob", 5_000_000.00f);
        Sponsor sponsor3 = new Sponsor("Putin", 5_000_000.00f);
        sponsorList(sponsor, sponsor1, sponsor2, sponsor3);
        bmw.addSponsor(sponsor, sponsor1);

        Mechanic mechanicAnton = new Mechanic("Петрвов Антон Иванович", "ООО Ремонтник года", Mechanic.TypeCar.ALL);
        Mechanic mechanicIvan = new Mechanic("Иванов Иван Иванович", "ООО Ремонтник года", Mechanic.TypeCar.BUS);
        Mechanic mechanicStepan = new Mechanic("Сидоров Степан Иванович", "ООО Ремонтник года", Mechanic.TypeCar.TRAC);
        Mechanic mechanicAlex = new Mechanic("Путин Алексей Иванович", "ООО Ремонтник года", Mechanic.TypeCar.CAR);
        mechanicList(mechanicAlex, mechanicIvan, mechanicStepan, mechanicAnton);
        bmw.addMechanic(mechanicAlex, mechanicAnton, mechanicIvan);
        //assignMechanec(audi, bmw, renault, mercedes);
        mechanicAnton.addCar(lias);
        mechanicAnton.addCar(nifaz);
        //mechanicAnton.addCar(audi);
        mechanicAnton.getMechanicInfo();
        checkFixCar(mechanicAnton);


        System.out.println("Автомобилем " + bmw.getBrand() + " управляет " + bmw.getDrivers() + " обслуживают " + bmw.getMechanics() + " спонсирует "  + bmw.getSponsors());
        System.out.println(bmw.toString());


        //System.out.println(mechanic..getBrand());
    }

    private static void mechanicList(Mechanic... mechanics) {
        LinkedList<Mechanic> mechanicList =new LinkedList<>();
        for (Mechanic mechanic : mechanics) {
            mechanicList.add(mechanic);
        }
    }

    private static void sponsorList(Sponsor... sponsors) {
       LinkedList<Sponsor> sponsorList =new LinkedList<>();
        for (Sponsor sponsor : sponsors) {
            sponsorList.add(sponsor);
        }
    }

    private static void checkFixCar(Mechanic mechanic) {
        for (int i = 0; i < mechanic.getCars().size(); i++) {
            if (mechanic.fixСar((Transport) mechanic.getCars().get(i))) {
                System.out.println("Автомобиль " + ((Transport) mechanic.getCars().get(i)).getBrand()+ " отремонтирован");
            } else {
                System.out.println("Автомобиль " + ((Transport) mechanic.getCars().get(i)).getBrand() + " пока в ремонте");
            }

        }
    }


    private static void addCars(Transport... transports) {
        LinkedList<Transport> garage = new LinkedList<>();
        for (Transport transprot: transports) {
            garage.add(transprot);
        }
        printCars(garage);

    }

    private static void printCars(LinkedList<Transport> garage) {
        int i = 0;
        try {
            while (!garage.isEmpty()) {
                System.out.println(garage.get(i));
                if (i +1 > garage.size()) {
                    throw new IndexOutOfBoundsException();
                }
                i++;
            }
        }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
        }
    }

    public static void service(Transport... transports) {
        for (Transport transport: transports) {
            try {
                if (!transport.diagnostics()) {
                    throw  new RuntimeException ("Автомобиль" + transport.getBrand() +  " " + transport.getModel()+ " не прошел диагностику");
                }

            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }


}