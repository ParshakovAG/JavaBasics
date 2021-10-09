public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 100);
        basket.print("Корзина \n");
        System.out.println();
        Basket sanyaBasket = new Basket();
        basket.add("Oil", 25, 250);
        basket.print("Корзина Sanya \n");
        System.out.println();
        Basket mashaBasket = new Basket();
        basket.add("Кефир", 30, 500);
        basket.print("Корзина Mashsa \n");
    }
}

