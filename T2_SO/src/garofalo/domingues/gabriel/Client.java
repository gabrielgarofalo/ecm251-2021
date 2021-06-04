package garofalo.domingues.gabriel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client extends Thread{
    private String nome;
    private Account conta;

    public Client(String nome, Account conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return this.nome;
    }

    public Account getConta() {
        return conta;
    }

    List<Double> valores = Arrays.asList(10.0, 20.0, 50.0, 100.0);

    Random aleatorio = new Random();
    public void execute(String nome){
        double valor = valores.get(aleatorio.nextInt(valores.size()));
        if(aleatorio.nextBoolean()){
            getConta().deposit(valor);
            System.out.println("Cliente: " + nome + " depositou " + valor + "\nConta: saldo atualizado de " + conta.getBalance());
        }else{
            getConta().withdraw(valor);
            System.out.println("Cliente: " + nome + " retirou " + valor + "\nConta: saldo atualizado de " + conta.getBalance());
        }
    }


    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", conta=" + conta +
                '}';
    }
}
