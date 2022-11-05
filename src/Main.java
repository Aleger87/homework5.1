import transport.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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

       /* service(audi, bmw, renault, mercedes,
                lias, nifaz, kamaz, paz,
                man, scania, isyzy, luidor);*/



        DriverB alex = new DriverB("Алексей Алексеевич Алексеев", true, 5, bmw);
        DriverB alex1 = new DriverB("Алексей Алексеевич Алексеев", true, 5, bmw);
        bmw.addDriver(alex);
        System.out.println(bmw.getDrivers());
        //System.out.println(bmw.getDrivers());

       /* System.out.println();
        System.out.println(alex.getFullName());
        System.out.println(alex.isLicense());
        System.out.println(alex.getExperience());
        alex.start();
        alex.refuel();
        alex.stop();
        System.out.println("Водитель " + alex.getFullName() + " управляет автомобилем " + alex.getCar().getBrand()+ " и будет участвовать в заезде" );*/


        Sponsor sponsor = new Sponsor("John", 5_000_000.00f);
        Sponsor sponsor4 = new Sponsor("John", 5_000_000.00f);
        Sponsor sponsor1 = new Sponsor("Adam", 5_000_000.00f);
        Sponsor sponsor2 = new Sponsor("Bob", 5_000_000.00f);
        Sponsor sponsor3 = new Sponsor("Putin", 5_000_000.00f);
        //sponsorList(sponsor, sponsor1, sponsor2, sponsor3);
        bmw.addSponsor(sponsor, sponsor4);
        System.out.println(bmw.getSponsors());


        Mechanic mechanicAnton = new Mechanic("Петрвов Антон Иванович", "ООО Ремонтник года", Mechanic.TypeCar.ALL);
        Mechanic mechanicAnton1 = new Mechanic("Петрвов Антон Иванович", "ООО Ремонтник года", Mechanic.TypeCar.ALL);
        Mechanic mechanicIvan = new Mechanic("Иванов Иван Иванович", "ООО Ремонтник года", Mechanic.TypeCar.BUS);
        Mechanic mechanicStepan = new Mechanic("Сидоров Степан Иванович", "ООО Ремонтник года", Mechanic.TypeCar.TRAC);
        Mechanic mechanicAlex = new Mechanic("Путин Алексей Иванович", "ООО Ремонтник года", Mechanic.TypeCar.CAR);

        bmw.addMechanic(mechanicAnton, mechanicIvan, mechanicAnton1);
        System.out.println(bmw.getMechanics());

        //mechanicList(mechanicAlex, mechanicIvan, mechanicStepan, mechanicAnton);
        //bmw.addMechanic(mechanicAlex, mechanicAnton, mechanicIvan);
        //assignMechanec(audi, bmw, renault, mercedes);
       // mechanicAnton.addCar(lias);
       // mechanicAnton.addCar(nifaz);
        //mechanicAnton.addCar(audi);
        //mechanicAnton.getMechanicInfo();
        //checkFixCar(mechanicAnton);


        /*Sto sto = new Sto("СТО");
        sto.addToQueue(bmw);
        sto.addToQueue(mercedes);
        sto.addCars(man, scania, isyzy,lias);

        sto.technicalInspection(audi);
        sto.technicalInspection(bmw);
        sto.technicalInspection(scania);
        sto.technicalInspection(lias);*/

        /*System.out.println("Автомобилем " + bmw.getBrand() + " управляет " + bmw.getDrivers() + " обслуживают " + bmw.getMechanics() + " спонсирует "  + bmw.getSponsors());
        System.out.println(bmw.toString());*/


        //System.out.println(mechanic..getBrand());

        /*addCars(audi, bmw, renault, mercedes,
                lias, nifaz, kamaz, paz,
                man, scania, isyzy, luidor);*/
    }

    private static void mechanicList(Mechanic... mechanics) {
        Set<Mechanic> mechanicList =new HashSet<>();
        for (Mechanic mechanic : mechanics) {
            mechanicList.add(mechanic);
        }
    }

    private static void sponsorList(Sponsor... sponsors) {
       Set<Sponsor> sponsorList =new HashSet<>();
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
        Set<Transport> garage = new HashSet<>();
        garage.addAll(Arrays.asList(transports));
        printCars(garage);

    }

    private static void printCars(Set<Transport> garage) {
        System.out.println(garage.toString());
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