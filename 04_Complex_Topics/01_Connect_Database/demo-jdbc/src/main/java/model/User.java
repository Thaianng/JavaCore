package model;

public class User {
    private String id;
    private String username;
    private Gender gender;
    private String password;

    public User(String id, String username, Gender gender, String password) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.password = password;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                '}';
    }
}
