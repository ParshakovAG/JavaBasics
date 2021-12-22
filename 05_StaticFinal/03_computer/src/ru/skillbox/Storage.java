package ru.skillbox;

public class Storage {
    private StorageType type;

    private final String name;
    private final String vendor;
    private final int diskSpace;

    public int getDiskSpace() {
        return diskSpace;
    }

    private final double diskWeight;

    public Storage(StorageType type, String name, String vendor, int diskSpace, double diskWeight) {
        this.type = type;
        this.name = name;
        this.vendor = vendor;
        this.diskSpace = diskSpace;
        this.diskWeight = diskWeight;
    }

    public Storage setStorage(StorageType ssd, String name, String vendor, double diskWeight) {
        return new Storage(type, "ST500Q", "WD", diskSpace, 0.4);
    }

    public StorageType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getDiskWeight() {
        return diskWeight;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Модель: " + getName() + "\n"
                + "Тип накопителя: " + getType() + "\n"
                + "Вес накопителя данных: " + getDiskWeight() + "\n";
    }

}
