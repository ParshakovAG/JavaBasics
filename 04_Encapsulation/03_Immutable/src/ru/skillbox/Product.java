package ru.skillbox;

    public class Product {
        private final String name = "";
        private final int price;
        private final int barCode;
        private String title;

    public Product(String name, int price, int barCode, String title) {

        this.price = price;
        this.barCode = barCode;
        this.title = title;

    }

    public void add(String nameProd, int price, int barCode) {
        title = title + nameProd + price + barCode;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getPrice() {
        return price;
    }

    public int getBarCode() {
        return barCode;

    }

    public void print(String name, int price, int barCode) {
        System.out.println(name + "\n" + price + " - " + "руб." +
                "\n" + "штрих код" + " - " + barCode);
    }
}
