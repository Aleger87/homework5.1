import transport.Buses;
import transport.Cars;
import transport.Transport;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {

        Cars transport = new Cars(null, null, 8);
        Cars audi = new Cars("Audi", "A8", 3.0f);
        transport.addCars(audi);
        Cars bmw = new Cars("BMW", "Z4", 3.0f);
        transport.addCars(bmw);
        Cars renault = new Cars("Renault", "Logan", 1.6f);
        transport.addCars(renault);
        Cars mercedes = new Cars("Mercedes", "E200", 3.0f);
        transport.addCars(mercedes);

        Buses lias = new Buses("Лиаз", null, 3);
        transport.addCars(lias);
        Buses nifaz = new Buses("Нифаз", null, 3);
        transport.addCars(nifaz);
        Buses kamaz = new Buses("Камаз", "А355", 4);
        transport.addCars(kamaz);
        Buses paz  = new Buses("ПАЗ", null, 3);
        transport.addCars(paz);

        Trucks man = new Trucks("Ман", null, 6);
        transport.addCars(man);
        Trucks scania = new Trucks("Скания", null, 6);
        transport.addCars(scania);
        Trucks isyzy = new Trucks("Исузу", null, 6);
        transport.addCars(isyzy);
        Trucks luidor = new Trucks("Луидор", null, 6);
        transport.addCars(luidor);

        for (int i = 0; i < transport.getCars().length; i++) {
            System.out.println(transport.getCars()[i].getBrand());
            printMetod(transport.getCars()[i]);
        }

    }

    private static void printMetod(Transport cars) {
        cars.startMovement();
        cars.finishMovement();
        cars.lapTime();
        cars.maxSpeed();
        cars.pitStop();
    }
}