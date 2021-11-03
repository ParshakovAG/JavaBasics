package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country1 country1 = new Country1("Губаха", 18, 58, "Пермь", false);
        country1.add("Губаха", 18, 58, "Пермь");
        country1.print();

        System.out.println();

        Country1 country2 = new Country1("Пермь", 2579, 160000.2, "Москва", false);
        country2.add("Пермь", 2579, 160000.2, "Москва");
        country2.print();

        System.out.println();

        Country3 country3 = new Country3("Санкт-Петербург", 5384342, 1439, "Москва", true);
        country3.add("Санкт-Петербург", 5384342, 1439, "Москва");
        country3.print();
    }
}
