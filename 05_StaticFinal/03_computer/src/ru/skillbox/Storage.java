package ru.skillbox;

public class Storage {
    private StorageType type;

    private final int diskStorageType;
    //private final int storageCapacity;
    private final String name;
    private final String vendor;
    private final double diskWeight;

    public Storage(StorageType type, int diskStorageType, String name, String vendor, double diskWeight) {
        this.type = type;
        this.diskStorageType = diskStorageType;
        //this.storageCapacity = storageCapacity;
        this.name = name;
        this.vendor = vendor;
        this.diskWeight = diskWeight;
    }

    public Storage setStorage(StorageType ssd, int diskStorageType, String name, String vendor, double diskWeight) {
        return new Storage(type, diskStorageType, "ST500Q", "WD", 0.4);
    }

    public StorageType getType() {
        return type;
    }

    public int getDiskStorageType() {
        return diskStorageType;
    }

//    public int getStorageCapacity() {
//        return storageCapacity;
//    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getDiskWeight() {
        return diskWeight;
    }


}
