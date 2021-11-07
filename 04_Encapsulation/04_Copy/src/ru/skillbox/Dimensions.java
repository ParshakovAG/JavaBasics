package ru.skillbox;

public class Dimensions {
    private final double width;
    private final double weight;
    private final double lenght;

    public Dimensions(double width, double weight, double lenght) {
        this.width = width;
        this.weight = weight;
        this.lenght = lenght;

    }

    public double getWidth() {
        return width;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, weight, lenght);
    }

    public double getWeight() {
        return weight;
    }

    public Dimensions setWeight(double weight) {
        return new Dimensions(width, weight, lenght);
    }

    public double getLenght() {
        return lenght;
    }

    public Dimensions setLenght(double lenght) {
        return new Dimensions(width, weight, lenght);
    }

    public double cargoVolume(double cargoVol) {
        return cargoVol = weight * width * lenght;
    }

    public String toString() {
        return "Высота: " + width + "\n"
                + "Вес: " + weight + "\n"
                + "Длина: " + lenght + "\n"
                + "Общий объем груза: " + cargoVolume(16);
    }

}

