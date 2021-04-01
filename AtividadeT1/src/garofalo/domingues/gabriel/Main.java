package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
        Contas c1 = new Contas("Usuario1", 1000);
        Contas c2 = new Contas("Usuario2", 2500);
        //Contas c3 = new Contas("Usuario3", 200);

        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        //System.out.println("Conta 3:" + c3.toString());

        //c1.transferirDinheiro(c2, 500);
        //c2.transferirDinheiro(c2,200);
        //c3.transferirDinheiro(c1,100);
        //c3.transferirDinheiro(c1,10000000);

        //System.out.println("Conta 1:" + c1.toString());
        //System.out.println("Conta 2:" + c2.toString());
        //System.out.println("Conta 3:" + c3.toString());
        Transacoes a = new Transacoes();
        System.out.println(a.criarQRCode(17, "ARROCHA", 8545.65));
        //String [] dados = a.criarQRCode(17, "ARROCHA", 8547.65).split(";");
        //System.out.println(dados[0]);
        a.pagamento(c1, c2,"17;ARROCHA;500;7956");
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
    }
}
