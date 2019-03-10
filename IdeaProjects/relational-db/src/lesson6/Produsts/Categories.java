package lesson6.Produsts;

public class Categories {
    private long categoryId;
    private String categoryName;
    private String description;
    private String price;

    public Categories(long categoryId, String categoryName, String description, String price) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.price = price;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}
