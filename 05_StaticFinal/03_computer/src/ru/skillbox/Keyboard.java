package ru.skillbox;

public class Keyboard {

    private KeyboardType type;
    private final String name;
    private final String vendor;
    public final double keyboardWeight;
    private final boolean keyboardLight;

    public boolean isKeyboardLight() {
        return keyboardLight;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public Keyboard(KeyboardType type, String name, String vendor, double keyboardWeight, boolean keyboardLight) {
        this.type = type;
        this.name = name;
        this.vendor = vendor;
        this.keyboardWeight = keyboardWeight;
        this.keyboardLight = keyboardLight;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Модель: " + getVendor() + "\n"
                + "Подсветка клавиатуры? " + (isKeyboardLight() ? "Да" : "Нет") + "\n"
                + "Вес клавиатуры: " + getKeyboardWeight() + " к/г " + "\n";
    }
}
