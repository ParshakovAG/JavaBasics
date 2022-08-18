public class PhysicalPersonClient extends Client {

    protected PhysicalPersonClient() {
    }

    protected PhysicalPersonClient(double amount) {
        super(amount);
    }
    @Override
    protected void info() {
        System.out.println("Пополнение и снятие без комиссии");
    }
}
