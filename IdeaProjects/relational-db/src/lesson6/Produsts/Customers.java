package lesson6.Produsts;

public class Customers {
    private long customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private long postalCode;
    private String country;
    private String phone;
    private String fax;

    public Customers(long customerId, String companyName, String contactName, String contactTitle, String address, String city, String region, long postalCode, String country, String phone, String fax) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }
}
