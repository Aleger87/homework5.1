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

        @Override
        public String toString() {
            return "Classification{" +
                    "bus='" + bus + '\'' +
                    '}';
        }
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
}
