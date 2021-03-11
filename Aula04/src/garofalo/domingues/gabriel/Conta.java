package garofalo.domingues.gabriel;

public class Conta {
    //Atributos das classes
    private Cliente cliente;
    private double saldo;
    private int numero;

    //Método das classes

    //Construtor da Classe
    public Conta(String nomeCliente, double saldoinical){
            this.saldo = saldoinical;
            this.cliente = new Cliente(nomeCliente);
            this.numero = 1234;
    }

    public Conta(String nomeCliente, String cpf){
        this.cliente = new Cliente(nomeCliente);
    }

    public double getSaldo(){
        return this.saldo;
    }

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

