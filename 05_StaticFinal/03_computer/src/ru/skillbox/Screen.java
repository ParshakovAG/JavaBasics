package ru.skillbox;

public class Screen {

    private ScreenType type;

    private final double screenWeight;

    public double getScreenWeight() {
        return screenWeight;
    }

    public ScreenType getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }

    private final String vendor;

    public Screen(double screenWeight, ScreenType type, String vendor) {
        this.screenWeight = screenWeight;
        this.type = type;
        this.vendor = vendor;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Тип: " + getType() + "\n"
                + "Вес экрана: " + getScreenWeight() + "\n";
    }
}
