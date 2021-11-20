public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 68, 1, 500, 1);
        basket.print("Корзина 1 \n");

        System.out.println();

        Basket vanyaBasket = new Basket();
        vanyaBasket.add("Egg", 76, 10, 700, 1);
        vanyaBasket.add("Oil", 45, 1, 250, 1);
        vanyaBasket.print("Корзина Вани \n");

        System.out.println();

        Basket sanyaBasket = new Basket();
        sanyaBasket.add("Chocolate", 110, 1, 90, 1);
        sanyaBasket.print("Корзина Сани \n");

        System.out.println();

        basket = new Basket();
        basket.print(Basket.getTotalWeightBasket());
        basket.print(Basket.getTotalPriceBasket());

        System.out.println();

        basket.print(Basket.getTotalQuantityAllGoods());
        basket.print(Basket.getTotalPriceBasketToCountBasket());
        basket.print(Basket.getTotalCostAllBasketToTotalQuantityAllGoods());
    }
}
