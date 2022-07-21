package Entites;

import Entites.Client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    private List<OrderItem> items = new ArrayList<>();


    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }


    private double totalPrice() {
        double valorTotal = 0;
        for (OrderItem i : items) {
            valorTotal = valorTotal + i.Subtotal();
        }

        return valorTotal;
    }



    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataEmString = dateFormat.format(moment);
        return "Order Moment: " + dataEmString + "\n" +
                "Order Status: " + status + "\n" +
                client + "\n" +
                "Order items: " + "\n" +
                items +"\n" +
                "Total price: $" + totalPrice()
                ;
    }
}

