package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
        Usuarios user1 = new Usuarios("Usuario1");
        Usuarios user2 = new Usuarios("Usuario2");
        Usuarios user3 = new Usuarios("Usuario3");

        Contas c1 = new Contas(user1, 1000);
        Contas c2 = new Contas(user2, 250);
        Contas c3 = new Contas(user3, 3000);

        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());

        //c1.transferirDinheiro(c2, 500);
        //c2.transferirDinheiro(c2,200);
        //c3.transferirDinheiro(c1,100);
        //c3.transferirDinheiro(c1,10000000);

        //System.out.println("Conta 1:" + c1.toString());
        //System.out.println("Conta 2:" + c2.toString());
        //System.out.println("Conta 3:" + c3.toString());
        //Transacoes a = new Transacoes();
        //System.out.println(a.criarQRCode(c1, 2000));
        //String [] dados = a.criarQRCode(17, "ARROCHA", 8547.65).split(";");
        //System.out.println(dados[0]);
        //a.pagamento(c1, c2,"2;Usuario2;200.0;9261");
        //System.out.println("Conta 1:" + c1.toString());
        //System.out.println("Conta 2:" + c2.toString());
    }
}
