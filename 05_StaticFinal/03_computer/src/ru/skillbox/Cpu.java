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

    public Cpu(String name, String vendor, double cpuCores, double cpuFrequency, double cpuWeight) {
        this.cpuCores = cpuCores;
        this.cpuFrequency = cpuFrequency;

        this.cpuWeight = cpuWeight;
    }

    public String toString() {
        return "Количество ядер процессора: " + getCpuCores() + "\n"
                + "Частота процессора: " + getCpuFrequency() + "\n"
                + "Вес процессора: " + getCpuWeight() + "\n";
    }
}
