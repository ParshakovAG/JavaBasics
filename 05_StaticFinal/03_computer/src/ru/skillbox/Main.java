package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Ram ddr = new Ram(RamType.DDR4, 2400, "DDR4", 8, "Kingston", 0.1);
        Storage one = new Storage(StorageType.SSD, 500, "SG500QT", "Seagate", 0.4);
        Screen on = new  Screen(10, ScreenType.LED, "Samsung");

        Computer test = new Computer("Intel", "Gigabyte", "Core i5 1150F", 2.90, 8, 16, "SSD", "Samsung", "Oklick", 5.01);

        System.out.println(test);
    }
}
