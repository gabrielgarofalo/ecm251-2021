// 19.01229-2 Gabriel Domingues Garofalo
// 19.02140-2 Leonardo Bezerra Celestino Zollner

package garofalo.domingues.gabriel;

public class Usuarios {
   private String nome;
   private String senha;
   private String email;

   public Usuarios(String nomeUsuario){
       this.nome = nomeUsuario;
       this.senha = senha;
       this.email = email;
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
