import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return name + " " + "(used) $ " + price + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
