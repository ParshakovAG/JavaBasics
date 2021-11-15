public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 500);
        basket.print("Корзина 1 \n");

        System.out.println();

        Basket vanyaBasket = new Basket();
        basket.add("Egg", 50, 10, 450);
        basket.print("Корзина Вани \n");

        System.out.println();

        Basket sanyaBasket = new Basket();
        sanyaBasket.add("Chocolate", 100, 1, 45);
        sanyaBasket.print("Корзина Сани \n");

        System.out.println();

        basket = new Basket();
        basket.print(Basket.getTotalWeightBasket());
        basket.print(Basket.getTotalPriceBasket());
        basket.print(Basket.getTotalCountBasket());
        basket.print(Basket.getTotalQuantityAllGoods());
        basket.print(Basket.getTotalPriceBasketToCountBasket());
        basket.print(Basket.getTotalCostAllBasketToTotalQuantityAllGoods());
    }
}
