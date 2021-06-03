package garofalo.domingues.gabriel;

public class Account {
    private Client cliente;
    private double balance;

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

    boolean transfer(Account destino, double valor) {
        if(this.withdraw(valor)){
            destino.deposit(valor);
            return true;
        }
        return false;
    }

    public Client getCliente() {
        return cliente;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cliente=" + cliente +
                ", balance=" + balance +
                '}';
    }
}
