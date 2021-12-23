package ru.skillbox;

public class Storage {

    private StorageType type;

    private final String storageType;
    private final double storageCapacity;
    private final double storageWeight;

    public Storage(String storageType, double storageCapacity, double storageWeight) {
        this.storageType = storageType;
        this.storageCapacity = storageCapacity;
        this.storageWeight = storageWeight;
    }

    public String getStorageType() {
        return storageType;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getStorageWeight() {
        return storageWeight;
    }

    public String toString() {
        return "Тип накопителя данных: " + getStorageType() + "\n"
                + "Объем накопителя: " + getStorageCapacity() + " Gb " + "\n"
                + "Вес накопителя: " + getStorageWeight() + " к/г " + "\n";
    }
}
