import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number products");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + "data:");

            System.out.println("Commom, used or imported (c/u/i)?");
            String type = sc.next();

            System.out.println("Name");
            String name = sc.next();

            System.out.println("Price");
            Double price = sc.nextDouble();

            if (type.equals("u")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Manufacture Date:");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));

            } else if (type.equals("i")) {
                System.out.println("Customs fee:");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                products.add(new Product(name, price));
            }
        }
        sc.close();

        System.out.println("PRICE TAG");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
