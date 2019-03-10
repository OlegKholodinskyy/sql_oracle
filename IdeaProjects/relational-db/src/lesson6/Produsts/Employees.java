package lesson6.Produsts;

import java.util.Date;

public class Employees {
    private long id;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthdate;
    private Date hiredate;
    private String address;
    private String city;
    private String region;
    private long postalcode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;

    public Employees(long id, String lastName, String firstName, String title, String titleOfCourtesy, Date birthdate, Date hiredate, String address, String city, String region, long postalcode, String country, String homePhone, String extension, String photo, String notes, String reportsTo) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalcode = postalcode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Date getHiredate() {
        return hiredate;
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

    public long getPostalcode() {
        return postalcode;
    }

    public String getCountry() {
        return country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public String getPhoto() {
        return photo;
    }

    public String getNotes() {
        return notes;
    }

    public String getReportsTo() {
        return reportsTo;
    }
}
