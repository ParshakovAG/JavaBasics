public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double weight;
    private int cost;
    private double totalWeight = 0;
    private static int totalPriceBasket;
    private static double totalWeightBasket;
    private static int totalCostAllBasket;
    private static int totalQuantityAllGoods;
    public static int countBasket = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров: \n";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        this.cost = this.cost + cost;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    private static void addTotalPriceBasket(int price) {
        totalPriceBasket += price;
    }

    private static void addTotalWeightBasket(double weight) {
        totalWeightBasket += weight;
    }

    private static void addTotalCostAllBasket(int totalCostAllBasket) {
        totalCostAllBasket += countBasket;
    }

    private static void addTotalQuantityAllGoods(int totalQuantityAllGoods) {
        totalQuantityAllGoods += count;
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        items += "\n" + name + " - " + count + " шт. - " + price + " р. " + weight + " гр.";
        this.totalPrice += price * count;
        this.totalWeight += weight * count;
        addTotalPriceBasket(price);
        addTotalWeightBasket(weight);
        addTotalCostAllBasket(cost);
    }

    public static String getTotalWeightBasket() {
        String total;
        total = "Общий вес всех корзин: "
                + totalWeightBasket;
        return total;
    }

    public static String getTotalPriceBasket() {
        String total;
        total = "Общая стоимость всех корзин: "
                + totalPriceBasket;
        return total;
    }

    public static String getTotalCostAllBasket() {
        String total;
        total = "Общее количество корзин: "
                + totalCostAllBasket;
        return total;
    }

    public static String getTotalQuantityAllGoods() {
        String total;
        total = "Общее количество всех товаров: "
                + totalQuantityAllGoods;
        return total;
    }

    public static String getTotalCostAllBasketToTotalQuantityAllGoods() {
        String total;
        total = "Отношение общей стоимости всех корзин к общему количеству всех товаров: "
                + (totalCostAllBasket / totalQuantityAllGoods);
        return total;
    }

    public static String getTotalPriceBasketToCountBasket() {
        String total;
        total = "Отношение общей стоимости всех корзин к количеству корзин: "
                + (totalPriceBasket / countBasket);
        return total;
    }

    public String getTotalPrice() {
        String total;
        total = "Общая стоимость корзины: " + totalPrice;
        return total;
    }

    public String getTotalWeight() {
        String total;
        total = "Общий вес корзины: " + totalWeight;
        return total;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }


    public boolean contains(String name) {

        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
