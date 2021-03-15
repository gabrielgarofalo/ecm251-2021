package garofalo.domingues.gabriel;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nomeCliente){
        this.nome = nomeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
