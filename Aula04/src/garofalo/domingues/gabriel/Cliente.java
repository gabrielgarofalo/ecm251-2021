package garofalo.domingues.gabriel;

public class Cliente {
    public Cliente(String nomeCliente){
        this.nome = nomeCliente;
    }

    private String nome;
    private String sobrenome;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
