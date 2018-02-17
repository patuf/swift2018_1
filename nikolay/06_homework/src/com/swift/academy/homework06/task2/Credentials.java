package com.swift.academy.homework06.task2;

public class Credentials {
    private final String userName;
    private String password;
    private final String[] oldPasswords;
    private int numOldPasswords = 0;

    public Credentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.oldPasswords = new String[100];
    }

    /**
     * For successful change of password, the current one must be correct and the new one must not be among the last 100 used.
     * @param currentPass
     * @param newPass
     * @return True if change pass was successful
     */
    public boolean changePassword(String currentPass, String newPass) {
        if (!passMatch(currentPass) || passMatch(newPass))
            return false;

        for (int i = 0; i < numOldPasswords; i++) {
            if (oldPasswords[i].equals(newPass))
                return false;
        }

        // We are ready to change the pass...but first store the old one
        oldPasswords[numOldPasswords++] = this.password;
        this.password = newPass;
        return true;
    }

    public String getUserName() {
        return this.userName;
    }

    /**
     * Just getting the current password is considered a security hole. The most information we can do is compare a guess and say if it's true.
     * @param guessPass
     * @return
     */
    public boolean passMatch(String guessPass) {
        return this.password.equals(guessPass);
    }
}
