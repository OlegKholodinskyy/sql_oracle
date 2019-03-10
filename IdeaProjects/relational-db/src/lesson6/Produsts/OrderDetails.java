package lesson6.Produsts;

public class OrderDetails {
    private Orders order;
    private Products product;

    private double unitPrice;
    private double quantity;
    private double discount;

    public OrderDetails(Orders order, Products product, double unitPrice, double quantity, double discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Orders getOrder() {
        return order;
    }

    public Products getProduct() {
        return product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }
}
