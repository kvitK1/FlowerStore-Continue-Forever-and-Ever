package flower.flowercontinue.decorator;

import flower.flowercontinue.flower.Flower;
import flower.flowercontinue.item.Item;

public class BusketDecorator implements AbstractDecorator{
    @Override
    public double decorate(Item flower) {
        return 24 + flower.getPrice();
    }
}
