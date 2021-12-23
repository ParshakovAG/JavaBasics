package ru.skillbox;

public class Computer {

    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    private double totalWeight;

    private final String name;
    private final String vendor;

    public Computer(String name, String vendor, Processor processor, Ram ram, Storage storage,
                    Screen screen, Keyboard keyboard, double totalWeight) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.name = name;
        this.vendor = vendor;
        this.totalWeight = calculateTotalWeight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    private double calculateTotalWeight() {
        return totalWeight = processor.getProcessorWeight() + ram.getRamWeight() + storage.getStorageWeight()
                + screen.getScreenWeight() + keyboard.getKeyboardWeight();
    }

    public String toString() {
        return "Имя ПК: " + getName() + "\n"
                + "Производитель: " + getVendor() + "\n"
                + "Процессор: " + getProcessor() + "\n"
                + "Оперативная память: " + getRam() + "\n"
                + "Накопитель данных: " + getStorage() + "\n"
                + "Экран: " + getScreen() + "\n"
                + "Клавиатура: " + getKeyboard() + "\n"
                + "Общий вес компонентов: " + getTotalWeight() + " к/г";
    }
}


