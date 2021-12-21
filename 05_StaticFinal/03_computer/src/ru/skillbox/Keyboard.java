package ru.skillbox;

public class Keyboard {

    private final String name;
    private final String vendor;
    public final double keyboardWeight;

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public Keyboard(String name, String vendor, double keyboardWeight) {
        this.name = name;
        this.vendor = vendor;
        this.keyboardWeight = keyboardWeight;
    }
}
