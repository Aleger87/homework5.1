package transport;

import transport.Exeption.CheckException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Sto<T extends Transport>  {

    private String name;
    private LinkedList<T> queue = new LinkedList<>();

    public Sto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sto{" +
                "name='" + name + '\'' +
                ", queue=" + queue +
                '}';
    }

    public void addToQueue(T car) {
       if (car instanceof Bus) {
           System.out.println("Автобусы не нуждаются в обслуживании");
       }else{
           queue.addLast(car);
           System.out.println("Машина " + car.getBrand() + " " + car.getModel()  + " добавлена в очередь на ремонт");
       }
    }

    public void addCars(T... cars) {
        for (T car : cars) {
            if (car instanceof Bus) {
                System.out.println("Автобусы не нуждаются в обслуживании");
            }else {
                this.queue.add(car);
            }
        }

    }

    public LinkedList<T> getQueue() {
        return queue;
    }

    public void technicalInspection(T car) {
        if (checkCarInService(car)) {
            if (fixСar(car)) {
                System.out.println("Автомобиль " + car.getBrand() + " отремонтирован и удален из очереди");
                queue.remove(car);
            } else {
                System.out.println("Автомобиль " + car.getBrand() + " пока в ремонте");
            }
        }else{
            System.out.println("Автомобиль " + car.getBrand() + " " + car.getModel() + " в сервис не поступал");
        }
    }

    private boolean checkCarInService(T car) {
        for (T t:queue) {
            if (t.equals(car)) {
                return true;
            }
        }
        return false;
    }


    public boolean fixСar(T car) {
        float rnd = (float) Math.random();
        if (rnd < 0.5) {
            return false;
        } else {
            return true ;
        }
    }

}
