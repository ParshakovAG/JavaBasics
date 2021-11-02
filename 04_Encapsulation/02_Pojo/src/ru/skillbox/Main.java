package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country1 = new Country("Губаха", 18, 58, "Пермь");
        country1.add("Губаха", 18, 58, "Пермь");
        country1.print();

        System.out.println();

        Country country2 = new Country("Пермь", 2579, 160000.2, "Москва");
        country2.add("Пермь", 2579, 160000.2, "Москва");
        country2.print();
    }
}
