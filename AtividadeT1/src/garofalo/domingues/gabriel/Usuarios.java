package garofalo.domingues.gabriel;

public class Usuarios {
   private String nome;
   private String senha;
   private String email;

   public Usuarios(String nomeUsuario){
       this.nome = nomeUsuario;
   }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
