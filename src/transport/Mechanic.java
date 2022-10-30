package transport;

import transport.Exeption.CheckException;

import java.util.LinkedList;

public class Mechanic<T extends Transport> {
   /* имя и фамилия;
    компания, в которой он работает;
    с какими автомобилями может работать (например, только с легковыми, грузовыми авто, автобусами или со всеми).*/
    public enum TypeCar {
       CAR ("легковые автомобили"),
       BUS ("автобусы"),
       TRAC ("грузовые автомобили"),
       ALL  ("любые автомобили");

       private String typeCar;

       public String getTypeCar()  {
           return typeCar;
       }

       TypeCar(String type) {
           this.typeCar = type;
       }
   }


    private String fullName;
    private String company;
    private LinkedList<T> cars = new LinkedList<>();
    private TypeCar typeCar;

    public Mechanic(String fullName, String company) {
        this(fullName, company, TypeCar.ALL, null);
    }
    public Mechanic(String fullName, String company, TypeCar typeCar) {
        this(fullName, company, typeCar, null);
    }
    public Mechanic(String fullName, String company, TypeCar typeCar, T car) {
        setFullName(fullName);
        setCompany(company);
        this.typeCar = typeCar;
        this.cars.add(car);
    }

    private void checkData(String data) throws CheckException {
        if (data != null) {
            throw new CheckException("Объект был указан ранее " + data);
        }
    }

    public void doMaintenance(T car) {
        System.out.println(car.getBrand() + car.getModel() + "прошел ТО");
    }
    public boolean fixСar (Transport car) {
        float rnd = (float) Math.random();
        if (rnd < 0.5) {
            return false;
        } else {
            return true ;
        }
    }

    public void addCar(T car) {
        for (T obj : cars) {
            if (obj == null) {
                cars.remove(obj);
            }
        }
        try {
            if (car instanceof Car && this.typeCar.equals(TypeCar.CAR) || this.typeCar.equals(TypeCar.ALL)) {
                this.cars.add(car);
            } else if (car instanceof Bus && this.typeCar.equals(TypeCar.BUS) || this.typeCar.equals(TypeCar.ALL)){
                this.cars.add(car);
            }else if (car instanceof Truck && this.typeCar.equals(TypeCar.TRAC) || this.typeCar.equals(TypeCar.ALL)) {
                this.cars.add(car);
            }else {
                throw new CheckException ("Механик " + getFullName() + " не может ремонтировать " + car.getBrand());
            }
        } catch (CheckException e) {
            System.out.println(e.getMessage());
            getMechanicInfo();
        }
    }

    public void removeCar(T car) {
        cars.remove(car);
    }

    public LinkedList<T> getCars() {
        return cars;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setFullName(String fullName) {
        try {
            checkData(this.fullName);
            if (fullName != null || fullName.isEmpty() || fullName.isBlank()) {
                this.fullName = fullName;
            }
        }catch (CheckException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCompany(String company) {
        try {
            checkData(this.company);
            if (company != null || company.isEmpty() || company.isBlank()) {
                this.company = company;
            }
        }catch (CheckException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", cars=" + cars +
                ", typeCar=" + typeCar +
                '}';
    }

    public void getMechanicInfo () {
        System.out.println("--Информация по механику--" +
                            "\nМеханик " + getFullName() +
                            "\nработает в компании "+ getCompany() +
                            "\nможет ремонтировать " +  typeCar.typeCar +
                            "\nсписок автомобилей" + getCars());
    }


}
