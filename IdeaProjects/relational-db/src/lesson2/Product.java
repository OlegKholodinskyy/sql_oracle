package lesson2;

public class Product {
    private long id;
    private String name;
    private String manufacturerName;
    private int costPrice;

    public Product(long id, String name, String manufacturerName, int costPrice) throws Exception {
        this.id = id;
        if (name.length()>50) throw new Exception("name must be less than 50 symbols");
        this.name = name;
        if (manufacturerName.length()>50) throw new Exception("manufacturerName must be less than 50 symbols");
        this.manufacturerName = manufacturerName;
        this.costPrice = costPrice;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getCostPrice() {
        return costPrice;
    }
}
