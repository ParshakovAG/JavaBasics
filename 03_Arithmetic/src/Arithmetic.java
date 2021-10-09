public class Arithmetic {

    public int amountNum(int first, int second) {
        int result = first + second;
        return result;
    }

    public int productNum(int one, int two) {
        int result = one * two;
        return result;
    }

    public static void main(String[] args) {
        Arithmetic summa = new Arithmetic();
        int summaResult = summa.amountNum(5, 2);
        System.out.println("Сумма " + summaResult);
        Arithmetic product = new Arithmetic();
        int productNumber = product.productNum(5, 2);
        System.out.println("Произведение " + productNumber);

    }

}