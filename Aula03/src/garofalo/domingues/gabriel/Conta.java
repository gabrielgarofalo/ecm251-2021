package garofalo.domingues.gabriel;

public class Conta {
    //Atributos das classes
    Cliente cliente;
    double saldo;
    int numero;

    //Método das classes
    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    void visualizarSaldo() {
        double saldo = 150;
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}

