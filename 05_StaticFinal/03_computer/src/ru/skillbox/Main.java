package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Computer test = new Computer("Intel", "Gigabyte", "Core i5 1150F", 2.90, 8, 16, "SSD", "Samsung", "Oklick", 5.01);
        Storage one = new Storage(StorageType.SSD, 500, "SG500QT", "Seagate", 0.4);
        Screen on = new  Screen(ScreenType.LED, "Samsung");

        System.out.println(test.toString());
        System.out.println(on.getType());

    }
}
