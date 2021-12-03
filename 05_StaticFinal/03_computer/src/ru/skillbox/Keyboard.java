package ru.skillbox;

public class Keyboard {

    private final String name;
    private final String vendor;

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public Keyboard(String name, String vendor) {
        this.name = name;
        this.vendor = vendor;
    }
}
