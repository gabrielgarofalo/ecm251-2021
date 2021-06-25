package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.Apresentacao;

public abstract class Membro implements Apresentacao {
    protected String nome_usuario;
    protected String email;
    protected TiposMembros funcao;
    protected Turnos horario;
    protected String mensagem = null;

    /**
     * Método construtor da classe Membro que inicializa seus parâmetros.
     * @param nome_usuario nome do membro a ser cadastrado
     * @param email email do membro a ser cadastrado
     * @param funcao função do membro cadastardo na comunidade
     * @param horario horário que esse membro cumprirá
     */
    public Membro(String nome_usuario, String email, TiposMembros funcao, Turnos horario) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.funcao = funcao;
        this.horario = horario;
    }

    /**
     * Metódo para pegar o nome de algum membro
     * @return Devolve o nome do membro selecionado
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * Metódo para pegar o horário de algum membro selecionado
     * @return Devolve o horário que o membro selecionado deve cumprir
     */
    public Turnos getHorario() {
        return horario;
    }

    /**
     * Metódo para pegar a função de algum membro selecionado
     * @return Devolve o nome do membro selecionado
     */
    public TiposMembros getFuncao() {
        return funcao;
    }

    /**
     * Metódo para definir o horário de algum membro caso mude
     * @param horario Uma das opções de turno disponíveis na enum Turnos
     */
    public void setHorario(Turnos horario) {
        this.horario = horario;
    }

    /**
     * Metódo para pegar a mensagem de algum membro caso mude o turno
     * @return Nova mensagem a ser postada
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Metódo para definir a mensagem de algum membro caso mude o turno
     * @param mensagem A string que a variável deve receber baseado no turno
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * Metódo que devolve as informações do usuário, implementado da interface Apresentacao, já que todos os Membros tem
     * @return Devolve as informações completas de cada membro
     */
    @Override
    public String usuarios() {
        return "Membro{" +
                "nome_usuario='" + nome_usuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                ", horario=" + horario +
                '}';
    }
}
