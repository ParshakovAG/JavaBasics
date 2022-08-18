public class CompanyClient extends PhysicalPersonClient {

    private final static double FEE = 0.01;

    @Override
    public void take(double amountTake) {
        super.take(amountTake + getAmountWithCommission(amountTake));
    }

    protected double getAmountWithCommission(double amount) {
        return amount * FEE;
    }
    @Override
    protected void info() {

        System.out.println("Пополнение без комиссии");
        System.out.println("Снятие - комиссия 1%");
    }
}
