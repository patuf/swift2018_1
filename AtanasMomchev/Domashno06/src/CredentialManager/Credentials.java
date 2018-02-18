package CredentialManager;

public class Credentials {
    private final String username;
    private String password;
    private String [] oldPass = new String[100];
    private int oldPassCount = 0;

    public Credentials(String user, String pass){
        username = user;
        password = pass;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String pass){
        password = pass;
    }
    public boolean passwordCheck(String pass){
        return password.equals(pass);
    }
    //method to change password
    public boolean changePassword(String pass, String newPass){
        if(password.equals(pass)){
            setPassword(newPass);
            return true;
        }
        return false;
    }
    public void setOldPass(String nextPass){
        oldPass[oldPassCount++] = nextPass;
    }
    //method to check if pass was used already
    public boolean checkOldpass(String pass) {
        if(oldPassCount == 0) return false;
        for (int i = 0; i < oldPassCount; i++) {
            if (oldPass[i].equals(pass))
                return true;
        }
        return true;
    }
}
