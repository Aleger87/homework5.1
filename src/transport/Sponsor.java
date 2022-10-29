package transport;

public class Sponsor {
    private String name;
    private float amount;

    public Sponsor(String name, float amount) {
        setName(name);
        setAmount(amount);
    }

    public void sponsorRace(){
        System.out.println("Заезд оплачен");
    }

    public void setName(String name) {
        try {
            if (!this.name.isEmpty()) {
                throw new RuntimeException("Имя уже есть");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Необходимо указать имя или название компании");
        } else {
            this.name = name;
        }
    }

    public void setAmount(float amount) {
        if (amount == 0) {
            throw new RuntimeException("Укажите сумму взноса");
        } else {
            this.amount = amount;
        }
    }

    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }
}
