package flower.flowercontinue.decorator;

import flower.flowercontinue.flower.Flower;
import flower.flowercontinue.item.Item;

public class PaperDecorator implements AbstractDecorator{
    @Override
    public double decorate(Item flower) {
        return 12 + flower.getPrice();
    }
}
