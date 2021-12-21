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

    public double totalWeight;

    public double calculateTotalWeight() {
        return totalWeight = cpu.getCpuWeight() + ram.ramWeight + storage.getDiskWeight() + screen.getScreenWeight()
        + keyboard.getKeyboardWeight();
    }

    public String toString() {
        return
                "Производитель ПК: " + getVendor() + "\n"
                        + "Имя ПК: " + getName() + "\n"
                        + "Модель процессора: " + getCpu() + "\n"
                        + "Количество ядер: " + getCpu().getCpuCores() + "\n"
                        + "Частота процессора: " + getCpu().getCpuFrequency() + "\n"
                        + "Оперативная память: " + ram + " Gb" + "Тип памяти: " + getRam().getRamType() + "\n"
                        + "Накопитель данных: " + storage + "\n"
                        + "Экран: " + screen + " 24' " + ScreenType.LED + "\n"
                        + "Клавиатура: " + keyboard + " " + "Подсветка? " + " есть" + "\n"
                        + "Общий вес компьютера: " + totalWeight + " грамм";

    }
}


