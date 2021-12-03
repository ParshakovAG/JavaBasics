package ru.skillbox;

public class RAM {

    private final double RamFrequency;
    private final String RamType;
    private final int RamCapacity;
    private final String vendor;

    public RAM(double ramFrequency, String ramType, int ramCapacity, String vendor) {
        RamFrequency = ramFrequency;
        RamType = ramType;
        RamCapacity = ramCapacity;
        this.vendor = vendor;
    }

    }

