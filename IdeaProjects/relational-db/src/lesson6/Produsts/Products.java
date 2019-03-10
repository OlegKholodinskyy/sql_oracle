package lesson6.Produsts;

public class Products {
    private long productId;
    private String productName;
    private Suppliers supplier;
    private Categories category;
    private long quantityPerUnit;
    private double unitPrice;
    private long unitsInStock;
    private long unitsOnOrder;
    private long reorderLevel;
    private double descontinued;

    public Products(long productId, String productName, Suppliers supplier, Categories category, long quantityPerUnit, double unitPrice, long unitsInStock, long unitsOnOrder, long reorderLevel, double descontinued) {
        this.productId = productId;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.descontinued = descontinued;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public Categories getCategory() {
        return category;
    }

    public long getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public long getUnitsInStock() {
        return unitsInStock;
    }

    public long getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public long getReorderLevel() {
        return reorderLevel;
    }

    public double getDescontinued() {
        return descontinued;
    }
}
