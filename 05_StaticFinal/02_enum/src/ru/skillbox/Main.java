package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 100);
        basket.getTotalPrice();
        basket.print("Корзина 1 \n");
        System.out.println();

        Basket basket1 = new Basket();
        basket.getCountBasket();
        basket.getTotalWeight();
        basket.add("Egg", 50, 10, 100);
        basket.print("Корзина 2 \n");

        System.out.println();

        Basket sanyaBasket = new Basket();
        sanyaBasket.add("Chocolate", 100, 1, 45);
        sanyaBasket.print("Корзина Сани \n");
    }
}
