public class Arithmetic {

        int num1;
        int num2;

    public Arithmetic(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public void sum(int sum) {
        System.out.println("Сумма " + sum);
    }
    public static void main(String [] args) {
        Arithmetic sum = new Arithmetic(5, 2);

    }
}


