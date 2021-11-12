package ru.skillbox;

public class Dimensions {
    private final double width;
    private final double height;
    private final double lenght;

    public Dimensions(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;

    }

    public double getWidth() {
        return width;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, lenght);
    }

    public double getWeight() {
        return height;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, lenght);
    }

    public double getLenght() {
        return lenght;
    }

    public Dimensions setLenght(double lenght) {
        return new Dimensions(width, height, lenght);
    }

    public double cargoVolume(double cargoVol) {
        return cargoVol = height * width * lenght;
    }

    public String toString() {
        return "Ширина: " + width + "\n"
                + "Высота: " + height + "\n"
                + "Длина: " + lenght + "\n"
                + "Общий объем груза: " + cargoVolume(1.5);
    }

}

