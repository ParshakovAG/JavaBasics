package ru.skillbox;

public class Ram {

    private final RamType type;
    private final double RamFrequency;
    private final String RamType;
    private final int RamCapacity;
    private final String vendor;
    public final double ramWeight;

    public ru.skillbox.RamType getType() {
        return type;
    }

    public double getRamFrequency() {
        return RamFrequency;
    }

    public String getRamType() {
        return RamType;
    }

    public int getRamCapacity() {
        return RamCapacity;
    }

    public String getVendor() {
        return vendor;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public Ram(RamType type, double ramFrequency, String ramType, int ramCapacity, String vendor, double ramWeight) {
        this.type = type;
        RamFrequency = ramFrequency;
        RamType = ramType;
        RamCapacity = ramCapacity;
        this.vendor = vendor;
        this.ramWeight = ramWeight;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Чачтота: " + getRamFrequency() + "\n"
                + "Тип памяти: " + getRamType() + "\n"
                + "Объем памяти: " + getRamCapacity() + "\n"
                + "Вес: " + getRamWeight() + "\n";
    }
}

