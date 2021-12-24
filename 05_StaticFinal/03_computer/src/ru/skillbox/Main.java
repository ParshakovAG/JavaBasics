package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Processor pc1 = new Processor(ProcessorType.CORES, 3.2, 4, 0.700);
        Ram pc3 = new Ram(RamType.DDR4, 2400, "DDR4", 8, 0.425);
        Storage pc2 = new Storage(StorageType.SSD, "SSD", 512, 0.200);
        Screen pc4 = new Screen(ScreenType.LED, 24.3, 5.600);
        Keyboard pc5 = new Keyboard(KeyboardType.LIGHT, "320M", "Oklick", 0.500, true);

        Computer pc6 = new Computer("PC User", "Intel", pc1, pc3, pc2, pc4, pc5, 10.6);

        System.out.println(pc6.toString());
    }
}
