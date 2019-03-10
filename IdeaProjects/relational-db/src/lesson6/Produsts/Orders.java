package lesson6.Produsts;

import java.util.Date;

public class Orders {
    private long orderId;
    private Customers customer;
    private Employees employee;
    private Shippers shipper;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private long shipPostalCode;
    private String shipCountry;

    public Orders(long orderId, Customers customer, Employees employee, Shippers shipper, Date orderDate, Date requiredDate, Date shippedDate, String shipVia, String freight, String shipName, String shipAddress, String shipCity, String shipRegion, long shipPostalCode, String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.shipper = shipper;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

    public long getOrderId() {
        return orderId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public Employees getEmployee() {
        return employee;
    }

    public Shippers getShipper() {
        return shipper;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public String getShipVia() {
        return shipVia;
    }

    public String getFreight() {
        return freight;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public long getShipPostalCode() {
        return shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }
}
