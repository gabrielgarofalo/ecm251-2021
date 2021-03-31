package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
        Contas c1 = new Contas("Usuario1", 1000);
        Contas c2 = new Contas("Usuario2", 2500);
        Contas c3 = new Contas("Usuario3", 200);

        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());

        c1.transferirDinheiro(c2, 500);
        c3.transferirDinheiro(c2,200);
        c3.transferirDinheiro(c1,100);
        c3.transferirDinheiro(c1,10000000);

        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
        System.out.println("Conta 3:" + c3.toString());
    }
}
