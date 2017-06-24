package Task_2;

import java.util.ArrayList;

class User {
    private int ID = 0;
    private String login;
    private String password;
    private String fullName;

    ArrayList<User> user = new ArrayList<>();

    public User(int ID, String login, String password, String fullName) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}