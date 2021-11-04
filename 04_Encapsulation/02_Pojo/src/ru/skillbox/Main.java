package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country = new Country("Губаха", 18, 58, "Пермь", false);
        country.add("Губаха", 18, 58, "Пермь");
        country.print();

        System.out.println();

        Country country2 = new Country("Пермь", 2579, 160000.2, "Москва", false);
        country2.add("Пермь", 2579, 160000.2, "Москва");
        country2.print();

        System.out.println();

        City city = new City("Санкт-Петербург", 5384342, 1439,"Москва", true, "Сити");
        city.add("Санкт-Петербург", 5384, 1439,"Москва", true, "Сити");
        city.print();
    }
}
