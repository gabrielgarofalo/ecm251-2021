package garofalo.domingues.gabriel;
import sun.misc.Signal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Client clients[] = {
                new Client("Augustus", account),
                new Client("Lucius", account),
                new Client("Claudius", account),
                new Client("Tiberius", account)};

        for(Client client:clients)
            client.execute();
            System.out.println();
    }
}