package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Delivery delivery = new Delivery(10.2, "Ленина 1 кв. 2", true, "№ 4558", true, 6);
        delivery.setWeight(10.5);
        delivery.setWeight(11.5);
        delivery.setAddress("ул. Свиязева 22");

//        Delivery copy = new Delivery(delivery.getWeight(),       //Полное копирование
//                delivery.getAddress(),
//                delivery.isToFlip(),
//                delivery.getRegNumber(),
//                delivery.isFragile());

//        System.out.println(copy);

        Dimensions dimensions = new Dimensions(5, 1.5, 5);
        dimensions.setWeight(16);
        
        System.out.println(delivery);
        System.out.println(dimensions.cargoVolume(6));



    }
}
