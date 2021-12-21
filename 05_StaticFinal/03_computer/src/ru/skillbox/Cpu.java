package ru.skillbox;

public class Cpu {
    private CpuType type;
    private final double cpuCores;
    private final double cpuFrequency;

    public double getCpuCores() {
        return cpuCores;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setType(CpuType type) {
        this.type = type;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    private final double cpuWeight;

    public Cpu(double v, double frequency, String name, String vendor,
               String cpu, double cores, String storage, String screen, String keyboard, double cpuCores, double cpuFrequency, double cpuWeight) {
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;

        this.cpuWeight = cpuWeight;
    }
}
