package ru.skillbox;

public class Processor {

private ProcessorType type;
private final double processorFrequency;
private final double processorCores;
private final double processorWeight;

public ProcessorType getType() {
        return type;
        }

public double getProcessorFrequency() {
        return processorFrequency;
        }

public double getProcessorCores() {
        return processorCores;
        }

public double getProcessorWeight() {
        return processorWeight;
        }

public Processor(double processorFrequency, double processorCores, double processorWeight) {
        this.processorFrequency = processorFrequency;
        this.processorCores = processorCores;
        this.processorWeight = processorWeight;
        }

public String toString() {
        return "Количество ядер процессора: " + getProcessorCores() + "\n"
        + "Частота: " + getProcessorFrequency() + "\n"
        + "Вес процессора: " + getProcessorWeight() + " к/г " + "\n";
        }
        }
