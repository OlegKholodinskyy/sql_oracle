package lesson6.forum;

import java.util.Date;

public class ForumCategory {
    private long id;
    private String title;
    private String description;
    private Date date;
    private String ip;

    public ForumCategory(long id, String title, String description, Date date, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getIp() {
        return ip;
    }
}
