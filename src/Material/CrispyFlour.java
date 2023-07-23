package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material implements Discount {
    Integer quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, Integer cost, Integer quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();

    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }


    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                "} " + super.toString();
    }

    @Override
    public LocalDate getDateNow() {
        return LocalDate.now();
    }

    @Override
    public double getRealMoney() {

        double monthsBetween = ChronoUnit.MONTHS.between(getManufacturingDate(), getDateNow());

        if (monthsBetween >= 10) {
            return this.getAmount() - (this.getAmount() * 0.4);
        } else if (monthsBetween >= 8) {
            return this.getAmount() - (this.getAmount() * 0.2);
        } else {
            return this.getAmount() - (this.getAmount() * 0.05);
        }
    }
}
