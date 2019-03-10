package lesson6.forum;

import java.util.Date;

public class ForumPosts {
    private long id;
    private ForumSubcategories forumSubcategorie;
    private Users user;
    private long parentPost;
    private String title;
    private String content;
    private Boolean isPoll;
    private Date date;
    private String ip;

    public ForumPosts(long id, ForumSubcategories forumSubcategorie, Users user, long parentPost, String title, String content, Boolean isPoll, Date date, String ip) {
        this.id = id;
        this.forumSubcategorie = forumSubcategorie;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumSubcategories getForumSubcategorie() {
        return forumSubcategorie;
    }

    public Users getUser() {
        return user;
    }

    public long getParentPost() {
        return parentPost;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Boolean getPoll() {
        return isPoll;
    }

    public Date getDate() {
        return date;
    }

    public String getIp() {
        return ip;
    }
}
