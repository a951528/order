package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;
    //int shipFeed = delivery.price; <<<不要寫這樣謝謝，寫在下面ㄉ建構子方法裡!!

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed= delivery.price;
    }

    public int total() {
        return amount+shipFeed;
    }
}
