package Entites;

public class OrderItem {

    private Integer quantity;

    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double Subtotal() {
        return product.getPrice()*this.quantity;
    }

    @Override
    public String toString() {

        return product.getName() + ", " + "$"+ product.getPrice()+ ", " + "Quantity:" + quantity + ", " + "Subtotal: "
                + Subtotal() + "\n";
    }
}
