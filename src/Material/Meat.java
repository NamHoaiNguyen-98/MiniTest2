package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material implements Discount {
    private Double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, Integer cost, Double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }


    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                "} " + super.toString();
    }
    @Override
    public LocalDate getDateNow() {
        return LocalDate.now();
    }

    @Override
    public double getRealMoney() {
        double daysBetween = ChronoUnit.DAYS.between(this.getManufacturingDate(), getDateNow());
        if (daysBetween >= 2) {
            return this.getAmount() - (this.getAmount() * 0.3);
        } else {
            return this.getAmount() - (this.getAmount() * 0.1);
        }

    }
}
