package ru.skillbox;

public class Screen {

    public double getScreenWeight() {
        return screenWeight;
    }

    private final double screenWeight;
    public ScreenType getType() {
        return type;
    }

    private ScreenType type;
    public String getVendor() {
        return vendor;
    }

    private final String vendor;

    public Screen(double screenWeight, ScreenType type, String vendor) {
        this.screenWeight = screenWeight;
        this.type = type;
        this.vendor = vendor;
    }
}
