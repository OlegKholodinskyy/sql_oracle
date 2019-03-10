package lesson6.forum;

import java.util.Date;

public class Users {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date date;
    private String karma;
    private String ip;

    public Users(long id, String nick, String password, String email, Date date, String karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.date = date;
        this.karma = karma;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }

    public String getKarma() {
        return karma;
    }

    public String getIp() {
        return ip;
    }
}
