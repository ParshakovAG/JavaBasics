package ru.skillbox;

public class Ram {

    private final double RamFrequency;
    private final String RamType;
    private final int RamCapacity;
    private final String vendor;
    private final double weight;

    public Ram(double ramFrequency, String ramType, int ramCapacity, String vendor, double weight) {
        RamFrequency = ramFrequency;
        RamType = ramType;
        RamCapacity = ramCapacity;
        this.vendor = vendor;
        this.weight = weight;
    }

    }

