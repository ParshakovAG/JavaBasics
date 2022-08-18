public class IndividualEntrepreneurClient extends CompanyClient{

    private static final double FEE_MORE_1000 = 0.005;
    private static final double FEE_LESS_1000 = 0.01;

    protected double getAmountWithCommissionMore_1000(double amount) {
        return amount * FEE_MORE_1000;
    }

    protected double getAmountWithCommissionLess_1000(double amount) {
        return amount * FEE_LESS_1000;
    }
    @Override
    public void put(double amountPut) {
        if (amountPut < 1000) {
            super.put(amountPut - getAmountWithCommissionLess_1000(amountPut));
        } else {
            super.put(amountPut - getAmountWithCommissionMore_1000(amountPut));
        }
    }
    @Override
    protected void info() {

        System.out.println("Пополнение: ");
        System.out.println("При сумме более 1000 - комиссия 0,5%:");
        System.out.println("Если сумма равна или меньше 1000 - комиссия 1%");
        System.out.println("Пополнение: ");
        System.out.println("Снятие без комиссии");
    }
}
