package flower.flowercontinue.order;


import flower.flowercontinue.delivery.Delivery;
import flower.flowercontinue.item.Item;
import flower.flowercontinue.payment.Payment;
import lombok.Getter;

import java.util.LinkedList;

public class Order {
    @Getter
    private Payment payment;
    @Getter
    private Delivery delivery;
    LinkedList<Item> busket = new LinkedList<Item>();

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void infoOrder() {
        System.out.println("Your order: {" + this.busket.toString() + "}");
        System.out.println("Total price: " + this.totalPrice());
    }

    public double totalPrice() {
        double price = 0;
        for (Item item: busket) {
            price += item.getPrice();
        }
        return price;
        // delivery transition costs
        // payment fee
        // decorations price
    }

    public void addFlower(Item item) {
        this.busket.add(item);
    }
    public void removeFlower(Item item) {
        this.busket.remove(item);
    }
}
