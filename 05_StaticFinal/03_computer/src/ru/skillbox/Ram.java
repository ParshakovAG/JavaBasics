package ru.skillbox;

public class Ram {

    private RamType type;
    private final double ramFrequency;
    private final String ramType;
    private final int ramCapacity;
    private final double ramWeight;

    public double getRamFrequency() {
        return ramFrequency;
    }

    public String getRamType() {
        return ramType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public Ram(double ramFrequency, String ramType, int ramCapacity, double ramWeight) {
        this.ramFrequency = ramFrequency;
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.ramWeight = ramWeight;
    }

    public String toString() {
        return "Частота оперативной памяти: " + getRamFrequency() + " MHz " + "\n"
                + "Тип оперативной памяти: " + getRamType() + "\n"
                + "Объем оперативной памяти: " + getRamCapacity() + " Gb " + "\n"
                + "Вес памяти: " + getRamWeight() + " к/г " + "\n";
    }
}

