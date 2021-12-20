package ru.skillbox;

public class Computer {

    private final String cpu;
    private final double cores;
    private final double ram;
    private final String storage;
    private final double frequency;
    private final String screen;
    private final String keyboard;

    private final String vendor;
    private final String name;

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public double getFrequency() {
        return frequency;
    }

    public Cpu setFrequency(double frequency, double cpuFrequency, double cpuCores) {
        double cpuWeight = 4.0;
        return new Cpu(frequency, cores, name, vendor, cpu, ram, storage, screen, keyboard, cpuCores, cpuFrequency, cpuWeight);
    }

    public double getCores() {
        return cores;
    }

    public Computer(String vendor, String name, String cpu, double frequency, double cores, double ram, String storage, String screen, String keyboard, double totalWeight) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.frequency = frequency;
        this.cores = cores;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.totalWeight = totalWeight;
    }
//    public double calculateTotalWeight() {
//       return totalWeight = cpu.getCpuWeight + ram.getRamWeight() +
//                storage.getStorageWeight() + screen.getScreenWeight() + keyboard.getKeyboardWeight();
//    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double totalWeight;

    public String toString() {
        return
                "Производитель ПК: " + getVendor() + "\n"
                        + "Имя ПК: " + getName() + "\n"
                        + "Модель процессора: " + getCpu() + "\n"
                        + "Количество ядер: " + getCores() + "\n"
                        + "Частота процессора: " + getFrequency() + "\n"
                        + "Оперативная память: " + ram + " Gb" + "\n"
                        + "Накопитель данных: " + storage + "\n"
                        + "Экран: " + screen + " 24' " + ScreenType.LED + "\n"
                        + "Клавиатура: " + keyboard + " " + "Подсветка? " + " есть" + "\n"
                        + "Общий вес компьютера: " + totalWeight + " грамм";

    }
}


