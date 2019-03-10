package lesson6.forum;

import java.util.Date;

public class ForumPollsOptionVotes{
    private long id;
    private ForumPollsOptions pollsOption;
    private Users user;
    private Date date;
    private String ip;

    public ForumPollsOptionVotes(long id, ForumPollsOptions pollsOption, Users user, Date date, String ip) {
        this.id = id;
        this.pollsOption = pollsOption;
        this.user = user;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumPollsOptions getPollsOption() {
        return pollsOption;
    }

    public Users getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public String getIp() {
        return ip;
    }
}
