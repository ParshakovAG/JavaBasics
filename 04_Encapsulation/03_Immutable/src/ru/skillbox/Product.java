package ru.skillbox;

    public class Product {
        private final String name = "";
        private int price;
        private final int barCode;

        private String title;

    public Product(String name, int price, int barCode, String title) {
        this.price = price;
        this.barCode = barCode;
        this.title = title;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }

        public String getTitle() {
            return title;
        }


    public void print(String name, int price, int barCode) {
        System.out.println(name + "\n" + price + " - " + "руб." +
                "\n" + "штрих код" + " - " + barCode);
    }
}
