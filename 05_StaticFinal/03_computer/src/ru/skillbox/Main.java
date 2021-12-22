package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Cpu pc1 = new Cpu("Core i5", "Intel", 8, 3.2, 0.530);
        Ram pc2 = new Ram(RamType.DDR4, 2400, "DDR4", 16, "Kingston", 0.650);
        Storage pc3 = new Storage(StorageType.SSD, "Q500T", "Seagate", 512, 0.300);
        Screen pc4 = new Screen(5.6, ScreenType.LED, "Samsung");
        Keyboard pc5 = new Keyboard(KeyboardType.LIGHT, "M250", "Oklick", 0.250);

        Computer pc6 = new Computer("Intel", "PC User", pc1, pc2, pc3, pc4, pc5, 5.6);

        System.out.println(pc6.toString());
    }
}
