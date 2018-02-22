package hmw06_objectsdebuging.task2credential;

public class Credentials {
    // fields
    private final String userName;// can't be change name
    private String password;//
    private String[] oldPassword;
    private int lastCredential;// count credentials


    // constructor


    // QUESTION how to stop instance when name is null or empty(i didn't wont to make object(not initialize fields)
    Credentials(String name,String password){
        this.userName=name;
        this.password=password;
        oldPassword=new String[100];
    }


    // property
    public String getUserName() {
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }
    // methods(functionality)

    public boolean changePassword(String actualPassword,String newPassword){
      //  if actual Password not same whit pass write actual pass not access to change password or two actual password are same whit new password, no reason to change whot self her
        if (!passwordIsMatch(actualPassword)||passwordIsMatch(newPassword))
            return false;
        // add new password to old password
        return addPassword( newPassword);
    }

    // add password
    public boolean addPassword(String newPassword){
        if (checkExistPassword(newPassword)<0) {
            return false;// can't add we have exist old password
        }
        // save old password
        oldPassword[lastCredential++]=this.password;
        // save new password

        this.password=newPassword;// take last for current
        return true;
    }

    // check old Passwords is available whit the new one
    public int checkExistPassword(String newPassword){
        int plIdx=0;
        for (int i = 0; i < lastCredential; i++) {
            // we found new pass is available in oldest
            if (oldPassword[i].equals(newPassword))
                return plIdx=-1;// idea we can't access to make change whit this password in the oldest
        }
            // we can add new password on last place
         return lastCredential;

    }
    // if two password are same return true, otherwise return false
    public boolean passwordIsMatch(String newPass){
        return this.password.equals(newPass);

    }


}
