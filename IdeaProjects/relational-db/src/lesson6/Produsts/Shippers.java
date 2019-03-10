package lesson6.Produsts;

public class Shippers {
    private long shipperId;
    private String companyName;
    private String phone;

    public Shippers(long shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }

    public long getShipperId() {
        return shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }
}
