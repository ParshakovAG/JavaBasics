package ru.skillbox;

public class Storage {
    private StorageType type;

    private final String name;
    private final String vendor;
    private final int storageSpace;

    public int getStorageSpace() {
        return storageSpace;
    }

    private final double storageWeight;

    public Storage(StorageType type, String name, String vendor, int storageSpace, double storageWeight) {
        this.type = type;
        this.name = name;
        this.vendor = vendor;
        this.storageSpace = storageSpace;
        this.storageWeight = storageWeight;
    }

    public Storage setStorage(StorageType ssd, String name, String vendor, double diskWeight) {
        return new Storage(type, "ST500Q", "WD", storageSpace, 0.4);
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

    public double getStorageWeight() {
        return storageWeight;
    }

    public String toString() {
        return "Производитель: " + getVendor() + "\n"
                + "Модель: " + getName() + "\n"
                + "Тип накопителя: " + getType() + "\n"
                + "Вес накопителя данных: " + getStorageWeight() + "\n";
    }

}
