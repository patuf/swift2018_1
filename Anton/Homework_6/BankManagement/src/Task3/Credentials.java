package Task3;

public class Credentials {
    private final String userName;
    private String password;
    private final String[] oldPasswords;
    private int numOldPasswords = 0;

    public Credentials(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.oldPasswords = new String[100];
    }


    public String getUserName(){
        return userName;
    }

    public boolean passMatch(String Password){
        return password.equals(Password);
    }
}