package garofalo.domingues.gabriel;

public class Contas {
    private Usuarios usuario;
    private int idConta;
    private double saldo;

    public Contas(String nomeUsuario, String senhaUsuario, String emailUsuario,int idConta, double saldoInicial){
        this.saldo = saldoInicial;
        this.idConta = idConta;
        this.usuario = new Usuarios(nomeUsuario, senhaUsuario, emailUsuario);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Contas destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
