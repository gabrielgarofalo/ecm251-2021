package garofalo.domingues.gabriel;

public class Account {
    private double balance;
    private Client client;

    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(double valor) {
        this.balance += valor;
    }

    boolean withdraw(double valor) {
        if(valor <= this.balance) {
            this.balance -= valor;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
