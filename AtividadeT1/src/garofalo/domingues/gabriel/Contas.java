package garofalo.domingues.gabriel;

public class Contas {
    private Usuarios usuario;
    private int idConta;
    private double saldo;
    private static int id = 1;

    public static int getProximoId() {
        return id++;
    }

    public Contas(String nomeUsuario, double saldoInicial){
        this.saldo = saldoInicial;
        this.idConta = getProximoId();
        this.usuario = new Usuarios(nomeUsuario);
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

    boolean transferirDinheiro(Contas destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getIdConta() {
        return this.idConta;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "usuario=" + usuario +
                ", idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
