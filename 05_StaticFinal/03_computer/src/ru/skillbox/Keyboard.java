package ru.skillbox;

public class Keyboard {

    private KeyboardType type;
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

    public Keyboard(KeyboardType type, String name, String vendor, double keyboardWeight) {
        this.type = type;
        this.name = name;
        this.vendor = vendor;
        this.keyboardWeight = keyboardWeight;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Модель: " + getVendor() + "\n"
                + "Вес клавиатуры: " + getKeyboardWeight() + "\n";
    }
}
