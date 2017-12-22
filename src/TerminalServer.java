
public class TerminalServer {
    private static double balance;

    public double getBalance() {
        return balance;
    }

    public void addMoney(double sum) {
        balance += sum;
    }

    public void takeMoney (double sum) {
        balance -= sum;
    }
}
