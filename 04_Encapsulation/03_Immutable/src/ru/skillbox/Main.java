package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java", "G. Shildt", 255, 777777);
        book.add("Java", 599);
        System.out.println(book);
        Product product = new Product("Name");
        product.add("Oil", 50, 1);
        System.out.println(product);
    }
}
