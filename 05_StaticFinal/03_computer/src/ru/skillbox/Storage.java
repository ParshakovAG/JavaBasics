package ru.skillbox;

public class Storage {

    private final StorageType type;

    private final String storageType;
    private final double storageCapacity;
    private final double storageWeight;

    public Storage(StorageType type, String storageType, double storageCapacity, double storageWeight) {
        this.type = type;
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
