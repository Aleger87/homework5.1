package transport;

public class Bus extends Transport implements Competing {

    public enum Classification {
        ESPECIALLY_SMALL ("до 10 мест"),
        SMALL ("до 25 мест"),
        AVERAGE ("40-50"),
        LARGE ("60-80"),
        ESPECIALLY_LARGE ("100-120 SEATS");

        private String bus;

        Classification(String bus) {
            this.bus = bus;
        }

        public String getBus() {
            return bus;
        }

        public void setBus(String bus) {
            this.bus = bus;
        }

        @Override
        public String toString() {
            return "Classification{" +
                    "bus='" + bus + '\'' +
                    '}';
        }
    }
    private Classification classification;

    public Bus(String brand, String model, float engineVolume, Classification classification) {
        super(brand, model, engineVolume);
        this.classification = classification;
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
        if (classification == null) {
            System.out.println("Не определено");
        }else{
            System.out.println("Вместимость " + classification.bus);
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

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
}
