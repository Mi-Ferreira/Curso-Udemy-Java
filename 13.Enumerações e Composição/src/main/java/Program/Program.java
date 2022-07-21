package Program;

import Entites.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dataComDiaMesAno = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client date");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth Date: ");
        Date birthDate = dataComDiaMesAno.parse(sc.next());


        System.out.println("Enter order data");
        System.out.println("Status: ");
        String status = sc.next();
        System.out.println("How many itens this is order: ");
        int numberOrder = sc.nextInt();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
        for (int i = 1; i <= numberOrder; i++) {
            System.out.println("Enter" + i + "°" + "item data");
            System.out.println("Product Name: ");
            String productName = sc.next();
            System.out.println("Product Price: ");
            Double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.println("Quantity: ");
            Integer quantity = sc.nextInt();
            order.addItem(new OrderItem(quantity, product));
        }
        sc.close();

        System.out.println("ORDER SUMMARY");
        System.out.println(order);

    }
}
