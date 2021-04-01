package garofalo.domingues.gabriel;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange ( int min , int max ) {
        Random r = new Random ();
        return r . nextInt (( max - min ) + 1 ) + min ;
    }

    public String criarQRCode(Contas conta, double valor){
        return conta.getIdConta() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" + getRandomNumberInRange(1000,9999);
    }

    public void pagamento(Contas pagador, Contas recebedor, String s){
        String [] dados = s.split(";");
        pagador.transferirDinheiro(recebedor, Double.parseDouble(dados[2]));
    }

}
