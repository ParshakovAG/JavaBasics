package ru.skillbox;

public class Storage {

    private final int storageType;
    private final int storageCapacity;
    private final String name;
    private final String vendor;

    public Storage(int storageType, int storageCapacity, String name, String vendor) {
        this.storageType = storageType;
        this.storageCapacity = storageCapacity;
        this.name = name;
        this.vendor = vendor;
    }
}
