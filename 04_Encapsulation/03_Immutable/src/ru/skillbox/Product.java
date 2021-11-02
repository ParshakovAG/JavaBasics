package ru.skillbox;

public class Product {
    private String name;
    public int price;
    private int barCode;

    public Product(String name) {
        this.name = name;
    }

    public void add(String nameProd, int price, int barCode) {
        name = name + "\n" + price + barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(String name, int price, int barCode) {
        System.out.println(name + "\n" + price + " - " + "руб." +
                "\n" + "штрих код" + " - " + barCode);
    }
}
