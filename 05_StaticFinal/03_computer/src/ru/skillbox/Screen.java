package ru.skillbox;

public class Screen {

    private ScreenType type;
    private final double size;
    private final double screenWeight;

    public double getScreenWeight() {
        return screenWeight;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public Screen(ScreenType type, double size, double screenWeight) {
        this.type = type;
        this.size = size;
        this.screenWeight = screenWeight;
    }

    public String toString() {
        return "Тип экрана: " + getType() + "\n"
                + "Размер: " + getSize() + " дюймов " + "\n"
                + "Вес экрана: " + getScreenWeight() + " к/г " + "\n";
    }
}

