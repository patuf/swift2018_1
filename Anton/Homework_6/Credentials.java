package Credentials;

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

    public boolean changePassword(String currentPass,String newPass) {
        if (!passMatch(currentPass) || passMatch(newPass))
            return false;

        for (int i = 0; i < numOldPasswords; i++) {
            if (oldPasswords[i].equals(newPass))
                return false;
        }

        oldPasswords[numOldPasswords++] = this.password;
        this.password = newPass;
        return true;
    }

    public String getUserName(){
        return this.userName;
    }

    public boolean passMatch(String guessPass){
        return this.password.equals(guessPass);
    }

}