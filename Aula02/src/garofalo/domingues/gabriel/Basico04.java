package garofalo.domingues.gabriel;

import java.util.Locale;
import java.util.Scanner;

public class Basico04 {
    //Interagir com o terminal - entrada de dados do usuário
    public static void main(String[] args) {
        String nome, mes, cavaleiro;
        System.out.println("Informe seu nome:");

        // Para ler dados do teclado (console)
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.println("Informe o mês de seu aniversário:");
        mes = scanner.nextLine();

        System.out.println("Nome:" + nome + " Mes:" + mes);
        cavaleiro = achaCavaleiro(mes);
        System.out.println("Cavaleiro:" + cavaleiro);
    }

    private static String achaCavaleiro(String mes) {
        mes = mes.toLowerCase();
        if(mes.equals("janeiro")) return "Shura";
        if(mes.equals("fevereiro")) return "Kamus";
        if(mes.equals("março")) return "Albafica";
        if(mes.equals("abril")) return "Mu";
        if(mes.equals("maio")) return "Aldebaram";
        if(mes.equals("junho")) return "Saga/Kanon";
        if(mes.equals("julho")) return "Mascara da Morte";
        if(mes.equals("agosto")) return "Aioros";
        if(mes.equals("setembro")) return "Shaka";
        if(mes.equals("outubro")) return "Mestre Ancião";
        if(mes.equals("novembro")) return "Miro";
        if(mes.equals("dezembro")) return "Aioros";
        else return "Serpentario";
    }
}
