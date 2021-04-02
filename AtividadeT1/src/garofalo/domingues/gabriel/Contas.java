// 19.01229-2 Gabriel Domingues Garofalo
// 19.02140-2 Leonardo Bezerra Celestino Zollner

package garofalo.domingues.gabriel;

public class Contas {
    private Usuarios usuario;
    private int idConta;
    private double saldo;
    private static int id = 1;

    public static int getProximoId() {
        return id++;
    }

    public Contas(Usuarios usuario, double saldoInicial){
        this.saldo = saldoInicial;
        this.idConta = getProximoId();
        this.usuario = usuario;
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

    public Usuarios getUsuario() {
        return usuario;
    }

    boolean transferirDinheiro(Contas destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            //System.out.println("Valor Transferido com Sucesso!");
            return true;
        }
        //System.out.println("Sem fundos suficientes");
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
