package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data;

/**
 * Created by lis on 18/03/17.
 */

public class Users {
    private String id;
    private String username;
    private String password;
    private String email;

    public  Users(String id, String username, String password, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
