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

    public Cpu setFrequency(double frequency) {
        return new Cpu(frequency, cores, name, vendor, cpu, ram, storage, screen, keyboard);
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

        public double totalWeight;

        public double getTotalWeight() {
            return totalWeight;
        }


        public String toString(){return "Производитель ПК: "
                + vendor + "\n"
                + "Имя ПК: " + name + "\n"
                + "Модель процессора: " + cpu + "\n" +
                "Оперативная память: " + ram + " Gb" + "\n"
                + "Накопитель данных: " + storage + "\n"
                + "Экран: " + screen + "\n"
                + "Клавиатура " + keyboard + "\n" +
                "Общий вес компьютера: " + totalWeight + " грамм";

        }
    }


