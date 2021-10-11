public class Arithmetic {

    public static void main(String[] args) {
        Arithmetic summa = new Arithmetic();
        int summaResult = summa.amountNum(5, 2);
        System.out.println("Сумма " + summaResult);
        Arithmetic product = new Arithmetic();
        int productNumber = product.productNum(5, 2);
        System.out.println("Произведение " + productNumber);
        Arithmetic bigger = new Arithmetic();
        int biggerResult = bigger.biggerNum(5, 2);
        System.out.println("Большее значение " + biggerResult);
    }

    public int amountNum(int first, int second) {
        int result = first + second;
        return result;
    }

    public int productNum(int one, int two) {
        int result = one * two;
        return result;
    }

    public int biggerNum(int a, int b) {
        if (a > b) {

        } else {
            System.out.println("Меньшее значение " + b);
        }

        return a;
    }
}

