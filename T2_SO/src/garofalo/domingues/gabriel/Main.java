// Felipe Oliveira Boacnin RA:19.00616-0
// Gabriel Domingues Garofalo 19.01229-2
// Gabriel Moreira Silva 19.00397-8
// Leonardo Bezerra Celestino Zollner 19.02140-2

package garofalo.domingues.gabriel;

import sun.misc.Signal;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Account account = new Account(1000);
        System.out.println("Conta criada com saldo inicial de: "+ account.getBalance());
        List<Client> clients= Arrays.asList(
                new Client("Augustus", account),
                new Client("Lucius", account),
                new Client("Claudius", account),
                new Client("Tiberius", account));

        Signal.handle(new Signal("INT"), sig -> {
            System.out.println("Terminando a simulação");
            for(Client client:clients){
                System.out.println(client.getNome() + " encerrando...");
                client.interrupt();
            }
        });

        for(Client client:clients){
            client.start();
        }

        while(true){
            Random aleatorio = new Random();
            Client pessoa = clients.get(aleatorio.nextInt(clients.size()));
            pessoa.execute(pessoa.getNome());
            Thread.sleep(500);
        }
    }
}