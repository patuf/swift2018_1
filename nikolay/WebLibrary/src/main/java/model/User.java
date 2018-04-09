package model;

public class User {
    private final String userName;
    private final String fullName;
    private final int age;
    private final String password;

    public User(String userName, String fullName, int age, String password) {
        this.userName = userName;
        this.fullName = fullName;
        this.age = age;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
