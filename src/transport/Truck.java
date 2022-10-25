package transport;

public class Truck extends Transport implements Competing{
    public enum Tonnage{
        N1 ("с полной массой до 3,5 тонн"),
        N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("с полной массой свыше 12 тонн");

        private String truck;

        Tonnage(String truck) {
            this.truck = truck;
        }

        public String getTruck() {
            return truck;
        }



    }
    private Tonnage  tonnage;

    public Truck(String brand, String model, float engineVolume, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;
    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void startMovement() {
        System.out.println("Завести машину");
    }

    @Override
    public void finishMovement() {
        System.out.println("Заглушить машину");
    }

    @Override
    public void typeTransport() {
        if (tonnage == null) {
            System.out.println("Не определено");
        }else{
            System.out.println("Грузоподъемность " +tonnage.truck);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Сменить резину");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшее время");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость");
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }
}
