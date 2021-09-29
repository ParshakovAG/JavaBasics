public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        Basket sanaBasket = new Basket();
        sanaBasket.add("Oil", 20);
        sanaBasket.add("Milk", 40);
        sanaBasket.print("Oil" + "Milk");
    }
}
