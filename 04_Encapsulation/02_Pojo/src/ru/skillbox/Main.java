package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country = new Country("Губаха", 18, 58, "Пермь", "Нет");
        country.add("Губаха", 18, 58, "Пермь", "Нет");
        country.print();

        System.out.println();

        Country country1 = new Country("Пермь", 2579, 160000.2, "Москва", "Нет");
        country1.add("", 2579, 160.2, "", "");
        country1.print();
    }
}
