package flower.flowercontinue.delivery;

import flower.flowercontinue.delivery.Delivery;

public class PostDelivery implements Delivery {
    @Override
    public double transitionCosts() {
        return 0.028;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public double deliver(double price) {
        return (price*(1+transitionCosts()));
    }
}
