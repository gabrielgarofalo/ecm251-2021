package garofalo.domingues.gabriel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {
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

    double[] valores = {10, 20, 50, 100};

    Random aleatorio = new Random();
    public void execute(){
        if(aleatorio.nextBoolean()){
            getConta().deposit(aleatorio.nextInt(valores.length));
        }else{
            getConta().withdraw(aleatorio.nextInt(valores.length));
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
