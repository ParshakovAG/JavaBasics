package ru.skillbox;

public class Product {
    private String name;
    public int price;
    private int barCode;

    public Product(String name) {
        this.name = name;
    }

    public void add(String nameProd, int price, int barCode) {
        name = "Oil";
        price = 1;
        barCode = 7;
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
}
