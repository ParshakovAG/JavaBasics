public abstract class Client {

    private double amount;

    protected Client() {
    }

    protected Client(double amount) {
        this.amount = amount;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {

        return amount;
    }

    public void put(double amountPut) {

        if (amountPut >= 0) {
            amount += amountPut;
            System.out.println(getAmount());
        }
    }
    public void take(double amountTake) {

        if (amountTake > getAmount() || amountTake < 0) {
            System.out.println("Недостаточно средств");
        } else {
            amount -= amountTake;
            System.out.println(getAmount());
        }
    }

    protected abstract void info();
}
