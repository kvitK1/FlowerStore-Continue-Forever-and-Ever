package flower.flowercontinue.payment;

import lombok.Setter;

public class PayPalPayment implements Payment{

    @Override
    public double fee() {
        return 0.1;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public boolean pay(double price) {
        double balance = price*2;
        price *= fee();
        if (price <= balance) {
            balance = balance - price;
            return true;
        }
        return false;
    }
}
