package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country country = new Country("Губаха", 18, 58, "Пермь", "Нет");
        country.add("Губаха", 18, 58, "Пермь", "Нет");
        country.print();
    }
}
