package CredentialManager;
import java.util.Arrays;

public class Credentials {
    private String [] users = new String[300];
    private String [] passes = new String[300];
    private String chpass = "";

    //method to fill the array
    public void fillArrays(){
        Arrays.fill(users,"");
        Arrays.fill(passes,"");
    }
    public void setPasses(String pass,int i){
        passes[i] = pass;
    }
    public void setUsers(String user, int i){
        users[i] = user;
    }
    //method to get user
    public String getUser(String user, int i) {
        for (int j = 0; j < users.length; j++) {
            if (users[j].equals(user)) {
                i = j;
                break;
            }
        }
        return users[i];
    }
    //method to receive user's password from array
    public String getPass(String user, int i) {
        for (int j = 0; j < users.length; j++) {
            if (users[j].equals(user)) {
                i = j;
                break;
            }
        }
        return passes[i];
    }
    //method to get position of a user and pass in arrays
    public int getPosition(String user, int i) {
        for (int j = 0; j < users.length; j++) {
            if (users[j].equals(user)) {
                i = j;
                break;
            }
        }
        return i;
    }
    //method to add user and password in arrays
    public void ENROLL(String user, String pass,int i ){
        if(user.equals(getUser(user,0))){
            System.out.println("User already exists!!!");
        }else {
            setUsers(user, i);
            setPasses(pass, i);
            //keeping used passwords in string
            chpass += user + " " + pass;
            System.out.println("ENROLL success");
        }
        }
        //method to change password
    public void CHPASS(String user, String pass, String newPass){
        //check if password has been used or if its the same and if pass is correct
        if(chpass.contains(user + " "+ newPass) || newPass.equals(pass) || !(pass.equals(getPass(user,0)))){
            System.out.println("CHPASS failed");
        }else {
            //add new pass to string
            chpass += user + " "+ newPass;
            setPasses(newPass, getPosition(user,0));
            System.out.println("CHPASS success");
        }
    }
    //method to authenticate user
    public void AUTH(String user, String pass){
        if(pass.equals(getPass(user,0))){
            System.out.println("AUTH success");
        }else
            System.out.println("AUTH fail");
    }
}
