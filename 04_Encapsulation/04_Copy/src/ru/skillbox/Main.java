package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Delivery delivery = new Delivery(1, "Ленина 1 кв. 2", true, "", true, 6);
        delivery.setWeight(10.5);

        Dimensions dimensions = new Dimensions(5, 10, 5);
        dimensions.setWeight(16);

        System.out.println(dimensions);
        System.out.println(delivery);


    }
}
