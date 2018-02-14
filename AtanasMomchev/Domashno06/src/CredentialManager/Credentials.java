package CredentialManager;

public class Credentials {
    private final String username;
    private String password;


    Credentials(String user, String pass){
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
        if (password.equals(pass)){
            return true;
        }
      return false;
    }
    public boolean changePassword(String pass, String newPass){
        if(passwordCheck(pass)){
            setPassword(newPass);
            return true;
        }
        return false;
    }
}
