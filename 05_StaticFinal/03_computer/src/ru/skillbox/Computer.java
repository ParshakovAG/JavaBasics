package ru.skillbox;

public class Computer {

    private final String vendor;
    private final String name;

    private final Cpu cpu;
    private final Ram ram;
    private final Storage storage;
    private final Screen screen;
    private final Keyboard keyboard;

    public Computer(String vendor, String name, Cpu cpu, Ram ram, Storage storage, Screen screen, Keyboard keyboard, double totalWeight) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.totalWeight = calculateTotalWeight();
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
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

    public double getTotalWeight() {
        return totalWeight;
    }

    private double totalWeight;

    private double calculateTotalWeight() {
        return totalWeight = cpu.getCpuWeight() + ram.getRamWeight() + storage.getDiskWeight() + screen.getScreenWeight()
        + keyboard.getKeyboardWeight();
    }

    public String toString() {
        return
                "Производитель ПК: " + getVendor() + "\n"
                        + "Имя ПК: " + getName() + "\n"
                       // + "Модель процессора: " + getCpu() + "\n"
                        + "Количество ядер: " + getCpu().getCpuCores() + "\n"
                        + "Частота процессора: " + getCpu().getCpuFrequency() + "\n"
                        + "Оперативная память: " + getRam() + "\n"
                        + "Накопитель данных: " + getStorage() + "Объем памяти: " + getStorage().getDiskSpace() + "\n"
                        + "Экран: " + getScreen() + "\n"
                        + "Клавиатура: " + getKeyboard() + "\n"
                        + "Общий вес компьютера: " + totalWeight + " к/г ";

    }
}


