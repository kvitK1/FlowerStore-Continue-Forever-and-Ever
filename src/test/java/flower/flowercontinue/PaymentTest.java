package flower.flowercontinue;

import flower.flowercontinue.delivery.DHLDelivery;
import flower.flowercontinue.delivery.PostDelivery;
import flower.flowercontinue.flower.Flower;
import flower.flowercontinue.flower.FlowerColor;
import flower.flowercontinue.flower.FlowerType;
import flower.flowercontinue.order.Order;
import flower.flowercontinue.payment.CreditCardPayment;
import flower.flowercontinue.payment.PayPalPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private Order order;
    private PayPalPayment payment1;
    private CreditCardPayment payment2;
    private Flower flower1;
    private Flower flower2;


    @BeforeEach
    public void init() {
        flower1 = new Flower(2.4, FlowerColor.WHITE, 23.4, FlowerType.TULIP);
        flower2 = new Flower(8, FlowerColor.BLUE, 40.6, FlowerType.CHAMOMILE);
        payment1 = new PayPalPayment();
        payment2 = new CreditCardPayment();
        order = new Order();
        order.addFlower(flower1);
        order.addFlower(flower2);
    }

    @Test
    public void testOrder() {
        Assertions.assertEquals(flower1.getPrice()+flower2.getPrice(), order.totalPrice());
    }

    @Test
    public void testPayment() {
        order.setPayment(payment2);
        Assertions.assertEquals(payment2, order.getPayment());
        boolean payForFlower1 = payment1.pay(flower1.getPrice());
        Assertions.assertEquals(true, payForFlower1);
    }
}
