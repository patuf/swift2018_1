package hmw06_objectsdebuging;

public class Credentials {

    private final String name;
    private String password;
    private String[] oldPass;
    private int countOldPass;

    Credentials(String name, String password) {
        int sizePass = 100;
        this.name = name;
        this.password = password;
        oldPass = new String[sizePass];

    }

    boolean changePassUser(String password, String newPassword) {

        if (checkOldPassword(password)) {
            if (newPassword.equals(null) || newPassword.isEmpty()) {
                if (comparePass(newPassword)) {
                    System.out.println("pass is equal it can't be change");
                    return false;
                }
                System.out.println("must write password!");
                return false;
            }else if(!comparePass(password)||comparePass(newPassword)){
                return false;
            }

        }
// here we can change password
        oldPass[countOldPass++] = this.password;// save old pass
        this.password = newPassword;// save new
        return true;

    }

    boolean checkOldPassword(String oldPass) {
        // have equals pass we can change
        for (int i = 0; i < countOldPass; i++) {
            if (this.oldPass[i].equals(oldPass)) {
                return true;
            }
        }
        // not equal pass can't change
        return false;
    }


    public boolean comparePass(String newPass) {
        return this.password.equals(newPass);
    }


    public String getUserName() {
        return this.name;
    }
}
