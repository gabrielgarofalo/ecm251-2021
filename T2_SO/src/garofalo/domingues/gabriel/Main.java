package garofalo.domingues.gabriel;
import sun.misc.Signal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Client customers[] = {
                new Client("Augustus", account),
                new Client("Lucius", account),
                new Client("Claudius", account),
                new Client("Tiberius", account)};
        Signal.handle(new Signal("INT"), // CTRL+C
                (Signal signal) ‐> {
            System.out.println("Terminando a simulação...");
            for (Customer customer : customers) {
                customer.interrupt();
            }
        });
        for (Customer customer : customers) {
            customer.start();
        }


