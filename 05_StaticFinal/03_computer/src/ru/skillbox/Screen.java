package ru.skillbox;

public class Screen {
    public ScreenType getType() {
        return type;
    }

    private ScreenType type;
    public String getVendor() {
        return vendor;
    }

    private final String vendor;

    public Screen(ScreenType type, String vendor) {
        this.type = type;
        this.vendor = vendor;
    }
}
