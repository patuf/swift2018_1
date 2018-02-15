package CredentialManager;

public class CredentialsManager {
    private Credentials [] users = new Credentials[200];
    private int userCount = 0;

    //method to add a new user
    public boolean newUser(String username, String password){
        if (usernameCheck(username)){
            return false;
        }else {
            users[userCount++] = new Credentials(username, password);
        }
        return true;
    }
    //method to change pass and check if the pass has been used
    public boolean changePass(String user, String pass, String newPass){
        if(!usernameCheck(user)) return false;
        if((!users[indexOf(user)].checkOldpass(pass)) && !pass.equals(newPass)){
            users[indexOf(user)].changePassword(pass,newPass);
            users[indexOf(user)].setOldPass(pass);
            return true;
        }
        return false;
    }
    //method to check if user and pass are correct
    public boolean authenticate(String user, String pass){
        if(!usernameCheck(user))return false;
        return users[indexOf(user)].passwordCheck(pass);
    }

    //geting where in the array is the method with THE username
    public int indexOf(String user){
        for(int i=0;i<userCount;i++){
            if(users[i].getUsername().equals(user)){
                return i;
            }
        }
        return -1;
    }
    //check if there is a object with username
    public boolean usernameCheck(String username){
        for(int i=0; i<userCount;i++){
            if(users[i].getUsername().equals(username))
                return true;
        }
        return false;
    }
}
