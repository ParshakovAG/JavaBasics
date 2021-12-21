package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Cpu pc1 = new Cpu("PC", "Intel", "Core i5", "SSD", "Samsung", "Oklick", 8, 3.2, 0.15);

        System.out.println(pc1.toString());
    }
}
