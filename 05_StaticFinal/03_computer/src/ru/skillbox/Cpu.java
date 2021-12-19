package ru.skillbox;

public class Cpu {

    public double getCpuWeight() {
        return cpuWeight;
    }

    private final double cpuWeight;
    public Cpu(double v, double frequency, String name, String vendor,
               String cpu, double cores, String storage, String screen, String keyboard, double cpuWeight) {

        this.cpuWeight = cpuWeight;
    }
}
