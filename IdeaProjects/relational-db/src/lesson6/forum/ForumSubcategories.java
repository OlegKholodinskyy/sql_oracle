package lesson6.forum;

import java.util.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategory forumCategory;
    private String title;
    private String description;
    private Date date;
    private String ip;

    public ForumSubcategories(long id, ForumCategory forumCategory, String title, String description, Date date, String ip) {
        this.id = id;
        this.forumCategory = forumCategory;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumCategory getForumCategory() {
        return forumCategory;
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
