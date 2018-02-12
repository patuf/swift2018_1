public class Credentials {

    private String username;
    private String password;

    private int oldPasswordCount;
    private String[] oldPasswords;

    Credentials(String usernameValue, String passwordValue) {
        username = usernameValue;
        password = passwordValue;

        oldPasswordCount = 0;
        oldPasswords = new String[100];
    }

    String getUsername() {
        return this.username;
    }

    public boolean matchPassword(String newPassword) {
        return this.password.equals(newPassword);
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (!matchPassword(oldPassword)) {
            return false;
        }
        if (matchPassword(newPassword)) {
            return false;
        }
        for (int i = 0; i < oldPasswordCount; i++) {
            if (oldPasswords[i].equals(newPassword)) {
                return false;
            }
        }
        oldPasswords[oldPasswordCount++] = password;
        this.password = newPassword;
        return true;
    }
}
