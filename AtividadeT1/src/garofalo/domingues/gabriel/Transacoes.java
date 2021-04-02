package garofalo.domingues.gabriel;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange ( int min , int max ) { // Função para gerar número aleátorio entre 2 int
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

    public String criarQRCode(Contas conta, double valor){ // Função para criar o QRCode com os dados especificados
        return conta.getIdConta() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" + getRandomNumberInRange(1000,9999);
    }

    public boolean pagamento(Contas pagador, Contas recebedor, String s){
        String [] dados = s.split(";"); // Dividir string em uma lista com cada campo um dado
        if((recebedor.getUsuario().getNome().equals(dados[1])) && (Integer.toString(recebedor.getIdConta()).equals(dados[0])) && (pagador.getSaldo() >= Double.parseDouble(dados[2]))){ // Verificação de nome, id e saldo
            pagador.transferirDinheiro(recebedor, Double.parseDouble(dados[2])); // Trnsferência entre as contas
            //System.out.println("Operação Válida!");
            return true;
        } else{
            //System.out.println("Operação Inválida!");
            return false;
        }
    }

}
