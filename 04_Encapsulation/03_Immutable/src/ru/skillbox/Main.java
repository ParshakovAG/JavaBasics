package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java", "G. Shildt", 255, 1010111);
        book.add("Java", 599);
        System.out.println();
        book.print("Java", 599);

        System.out.println();

        Product product = new Product("Name", 4, 777, "DS");
        product.add("Oil", 50, 1);

        System.out.println();

        product.print("Oil", 50, 777);
    }
}
