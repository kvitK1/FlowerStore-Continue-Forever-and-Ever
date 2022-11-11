package flower.flowercontinue;

import flower.flowercontinue.delivery.DHLDelivery;
import flower.flowercontinue.delivery.PostDelivery;
import flower.flowercontinue.flower.Flower;
import flower.flowercontinue.flower.FlowerColor;
import flower.flowercontinue.flower.FlowerType;
import flower.flowercontinue.order.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeliveryTest {
    private Order order;
    private DHLDelivery delivery1;
    private PostDelivery delivery2;
    private Flower flower1;
    private Flower flower2;


    @BeforeEach
    public void init() {
        flower1 = new Flower(2.4, FlowerColor.WHITE, 23.4, FlowerType.TULIP);
        flower2 = new Flower(8, FlowerColor.BLUE, 40.6, FlowerType.CHAMOMILE);
        delivery1 = new DHLDelivery();
        delivery2 = new PostDelivery();
        order = new Order();
        order.addFlower(flower1);
        order.addFlower(flower2);
    }

    @Test
    public void testOrder() {
        Assertions.assertEquals(flower1.getPrice()+flower2.getPrice(), order.totalPrice());
    }

    @Test
    public void testDelivery() {
        order.setDelivery(delivery1);
        Assertions.assertEquals(delivery1, order.getDelivery());
        double deliverFlower1 = delivery1.deliver(flower1.getPrice());
        Assertions.assertEquals((1+delivery1.transitionCosts())*flower1.getPrice(), deliverFlower1);
    }
}
