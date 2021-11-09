package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Delivery delivery = new Delivery(10.2, "ул. Парковая 1 кв. 2", true, "№ 4558", true, 6);
        Delivery delivery1 = delivery.setAddress("Ленина 1 кв. 11");
        Delivery delivery2 = delivery.setWeight(5.5);

        System.out.println(delivery);
        System.out.println(delivery1);
        System.out.println(delivery2);

//        Delivery copy = new Delivery(delivery.getWeight(),       //Полное копирование
//                delivery.getAddress(),
//                delivery.isToFlip(),
//                delivery.getRegNumber(),
//                delivery.isFragile());
//
//        System.out.println(copy);

        Dimensions dimensions = new Dimensions(1, 1.5, 5);
        Dimensions dimensions1 = dimensions.setLenght(50);
        Dimensions dimensions2 = dimensions.setWidth(7);
        Dimensions dimensions3 = dimensions.setHeight(9);

        System.out.println(dimensions);
        System.out.println(dimensions1);
        System.out.println(dimensions2);
        System.out.println(dimensions3);




    }
}
