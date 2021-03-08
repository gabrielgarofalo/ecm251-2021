package garofalo.domingues.gabriel;

public class Main {

    public static void main(String[] args) {
	    // Cria um objeto do tipo conta
        Conta c1;
        //Instancia um objeto Conta
        c1 = new Conta();

        // Pede para conta exibir o saldo
        c1.visualizarSaldo();

        //Modificar saldo
        c1.saldo = 100;

        c1.visualizarSaldo();

        //Criar novo episódio do tipo conta
        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(300);
        c2.depositar(100);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

//        if(c1.sacar(400)){
//            System.out.println("Hoje tem PlayStation!");
//        } else{
//            System.out.println("Deu Ruim!");
//        }

        if(c1.transferirDinheiro(c2, 2500)){
            System.out.println("Tranferência realizada com sucesso!");
        } else{
            System.out.println("Não foi possível realizar a transferência!");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        System.out.println("Nome do cliente:"+c1.cliente.nome);
        System.out.println("Nome do cliente:"+c2.cliente.nome);
        c1.cliente.nome = "Izuku";
        c1.cliente.sobrenome = "Midoria";
        c1.numero = 9;
        System.out.println("C1:" + c1.toString());
    }
}
