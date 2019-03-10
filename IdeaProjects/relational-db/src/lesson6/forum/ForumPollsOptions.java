package lesson6.forum;

import java.util.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts post;
    private String title;
    private Date date;

    public ForumPollsOptions(long id, ForumPosts post, String title, Date date) {
        this.id = id;
        this.post = post;
        this.title = title;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public ForumPosts getPost() {
        return post;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }
}
