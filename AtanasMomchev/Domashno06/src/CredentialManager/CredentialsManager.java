package CredentialManager;

public class CredentialsManager {
    private Credentials [] users = new Credentials[200];
    private int userCount = 0;
    private String [] oldPass = new String[100];
    private int oldPassCount = 0;

    public boolean newUser(String username, String password){
        if (usernameCheck(username)){
            return false;
        }else {
            users[userCount++] = new Credentials(username, password);
        }
        return true;
    }
    public boolean changePass(String user, String pass, String newPass){
        if(users[indexOf(user)].passwordCheck(pass) && !checkOldpass(newPass) && !pass.equals(newPass)){
            users[indexOf(user)].setPassword(newPass);
            oldPass[oldPassCount++] = pass;
            return true;
        }
        return false;
    }
    public boolean authenticate(String user, String pass){
        if(!usernameCheck(user))return false;
        if(users[indexOf(user)].getUsername().equals(user) && users[indexOf(user)].passwordCheck(pass)){
            return true;
        }
        return false;
    }
    public boolean checkOldpass(String pass) {
        if(oldPassCount == 0) return false;
        for (int i = 0; i < oldPassCount; i++) {
            if (oldPass[i].equals(pass))
                return true;
        }
        return true;
    }
    public int indexOf(String user){
        for(int i=0;i<userCount;i++){
            if(users[i].getUsername().equals(user)){
                return i;
            }
        }
        return -1;
    }
    public boolean usernameCheck(String username){
        for(int i=0; i<userCount;i++){
            if(users[i].getUsername().equals(username))
                return true;
        }
        return false;
    }
}
