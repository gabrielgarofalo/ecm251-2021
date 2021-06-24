package garofalo.domingues.gabriel;

import java.util.Scanner;
import java.util.ArrayList;

import garofalo.domingues.gabriel.models.*;

public class Sistema {
    private Scanner scanner;
    ArrayList<Membro> Membros = new ArrayList<Membro>();
    private Mobile_Members mobile;
    private Heavy_Lifters heavy;
    private Script_Guys script;
    private Big_Brothers big;
    
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
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Qual é a função do membro?");
                System.out.println("1 - Mobile Member");
                System.out.println("2 - Heavy Lifter");
                System.out.println("3 - Script Guy");
                System.out.println("4 - Big Brother");
                int funcao = scanner.nextInt();
                switch (funcao){
                    case 1:
                        System.out.println("Nome:");
                        String nome1 = scanner.next();
                        System.out.println("E-mail:");
                        String email1 = scanner.next();
                        mobile = new Mobile_Members(nome1, email1);
                        Membros.add(mobile);
                        break;
                    case 2:
                        System.out.println("Nome:");
                        String nome2 = scanner.next();
                        System.out.println("E-mail:");
                        String email2 = scanner.next();
                        heavy = new Heavy_Lifters(nome2, email2);
                        Membros.add(heavy);
                        break;
                    case 3:
                        System.out.println("Nome:");
                        String nome3 = scanner.next();
                        System.out.println("E-mail:");
                        String email3 = scanner.next();
                        script = new Script_Guys(nome3, email3);
                        Membros.add(script);
                        break;
                    case 4:
                        System.out.println("Nome:");
                        String nome4 = scanner.next();
                        System.out.println("E-mail:");
                        String email4= scanner.next();
                        big = new Big_Brothers(nome4, email4);
                        Membros.add(big);
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                }
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
