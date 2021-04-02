// 19.01229-2 Gabriel Domingues Garofalo
// 19.02140-2 Leonardo Bezerra Celestino Zollner

package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
        // Criação dos usuários
        Usuarios user1 = new Usuarios("All Might");
        Usuarios user2 = new Usuarios("One For All");
        Usuarios user3 = new Usuarios("Bakugo");

        // Criação das contas dos usuários
        Contas c1 = new Contas(user1, 1000);
        Contas c2 = new Contas(user2, 250);
        Contas c3 = new Contas(user3, 3000);

        // Estado Inicial das Contas
        System.out.println("Estado Inical:");
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());

        Transacoes transacao = new Transacoes();

        String op1 = transacao.criarQRCode(c1,250); // Usuário 1 gera uma operação de recebimento de 250

        transacao.pagamento(c2, c1, op1); // Usário 2 paga a operação
        transacao.pagamento(c3, c1, op1); // Usário 3 paga a operação
        transacao.pagamento(c2, c1, op1); // Usário 2 paga a operação novamente

        String op2 = transacao.criarQRCode(c2,1000); // Usuário 2 gera uma operação de recebimento de 1000

        transacao.pagamento(c3, c2, op2); // Usário 3 paga a operação

        // Estado Final das Contas
        System.out.println("Estado Final:");
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());
    }
}
