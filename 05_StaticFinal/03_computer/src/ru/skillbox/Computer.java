package ru.skillbox;

public class Computer {

    private final String vendor;
    private final String name;
    private final String cpu;
    private double frequency;
    private double cores;

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getCores() {
        return cores;
    }

    public void setCores(double cores) {
        this.cores = cores;
    }

    public Computer(String vendor, String name, String cpu, double frequency, double cores) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.frequency = frequency;
        this.cores = cores;
    }

}
