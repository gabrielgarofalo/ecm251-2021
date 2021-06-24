package garofalo.domingues.gabriel;

import java.util.Scanner;

public class Sistema {
    private Scanner scanner;
    
    public Sistema(){
        scanner = new Scanner(System.in);
        menu();
    }

    public void menu() {
        System.out.println("Bem-Vindo!");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Registrar Membros");
        System.out.println("2 - Informar Horário de Trabalho");
        System.out.println("3 - Postar Mensagem");
        System.out.println("Opção desejada:");
        int opcao = Integer.parseInt(scanner.next());

        switch (opcao){
            case 1:
                System.out.println("caso 1");
                break;
            case 2:
                System.out.println("caso 2");
                break;
            case 3:
                System.out.println("caso 3");
                break;
            default:
                System.out.println("Digite uma opção válida!");
        }

    }
}
