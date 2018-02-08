package com.swift.academy.statics;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        // Lazy loading
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    //* Private constructor */
    private Singleton() {
        initSettings();
    }

    //* Object state properties
    private int settingA;
    private String settingB;
    private boolean settingC;

    //* non-static object initializer */
    private void initSettings() {
        // Read the settings from a file?
        settingA = 5;
        settingB = "forever";
        settingC = false;
    }

    // Getters and setters  for the properties
    public int getSettingA() {
        return settingA;
    }

    public void setSettingA(int settingA) {
        this.settingA = settingA;
    }

    public String getSettingB() {
        return settingB;
    }

    public void setSettingB(String settingB) {
        this.settingB = settingB;
    }

    public boolean isSettingC() {
        return settingC;
    }

    public void setSettingC(boolean settingC) {
        this.settingC = settingC;
    }
}
