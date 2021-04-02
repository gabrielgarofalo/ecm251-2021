package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
        Usuarios user1 = new Usuarios("All Might");
        Usuarios user2 = new Usuarios("One For All");
        Usuarios user3 = new Usuarios("Bakugo");

        Contas c1 = new Contas(user1, 1000);
        Contas c2 = new Contas(user2, 250);
        Contas c3 = new Contas(user3, 3000);

        System.out.println("Estado Inical:");
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());

        Transacoes transacao = new Transacoes();

        String op1 = transacao.criarQRCode(c1,250);

        transacao.pagamento(c2, c1, op1);
        transacao.pagamento(c3, c1, op1);
        transacao.pagamento(c2, c1, op1);

        String op2 = transacao.criarQRCode(c2,1000);

        transacao.pagamento(c3, c2, op2);

        System.out.println("Estado Final:");
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());
    }
}
