package ru.skillbox;

    public class Product {
        private final String name = "";
        private final int price = 10;
        private final int barCode;
        private String title;

    public Product(String name, int barCode, String title) {

        this.barCode = barCode;
        this.title = title;

    }

    public int setPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;

    }

    public void print(String name, int price, int barCode) {
        System.out.println(name + "\n" + price + " - " + "руб." +
                "\n" + "штрих код" + " - " + barCode);
    }
}
