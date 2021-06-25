package garofalo.domingues.gabriel;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;
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
        System.out.println("4 - Mudar Horário de Trabalho");
        System.out.println("5 - Remover Membros");
        System.out.println("6 - Listagem dos usuários");
        System.out.println("0 - Sair");
        System.out.println("Opção desejada:");
        int opcao = scanner.nextInt();
        do {
            switch (opcao) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Qual é a função do membro?");
                    System.out.println("1 - Mobile Member");
                    System.out.println("2 - Heavy Lifter");
                    System.out.println("3 - Script Guy");
                    System.out.println("4 - Big Brother");
                    int funcao = scanner.nextInt();
                    switch (funcao) {
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
                            String email4 = scanner.next();
                            big = new Big_Brothers(nome4, email4);
                            Membros.add(big);
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                    }
                    menu();
                case 2:
                    System.out.println("Digite seu nome de usuário:");
                    String nome_usuario = scanner.next();
                    Membro resultado = null;
                    for (Membro membro : Membros) {
                        if (nome_usuario.equals(membro.getNome_usuario())) {
                            resultado = membro;
                            break;
                        }
                    }
                    System.out.println("Horário: " + resultado.getHorario());
                    menu();
                case 3:
                    for (Membro membro : Membros) {
                        System.out.println(membro.getNome_usuario() + " : " + membro.getMensagem());
                    }
                    menu();
                case 4:
                    System.out.println("Horário Atual :" + Membros.get(0).getHorario());
                    System.out.println("Deseja mesmo mudar o horário? (s/n)");
                    String escolha = scanner.next();
                    if (escolha.equals('y')) {
                        if (Membros.get(0).getHorario() == Turnos.Regular) {
                            for (Membro membro : Membros) {
                                membro.setHorario(Turnos.Extra);
                            }
                        } else {
                            for (Membro membro : Membros) {
                                membro.setHorario(Turnos.Regular);
                            }
                        }
                        System.out.println("Novo Horário :" + Membros.get(0).getHorario());
                    } else{break;}
                    menu();
                case 5:
                    System.out.println("Digite o nome do usuário que quer remover:");
                    String delusuario = scanner.next();
                    Membro achou = null;
                    for (Membro membro : Membros) {
                        if (delusuario.equals(membro.getNome_usuario())) {
                            achou = membro;
                            break;
                        }
                    }
                    Membros.remove(achou.getNome_usuario());
                    System.out.println("Usuário deletado com sucesso!");
                    menu();
                case 6:
                    for (Membro membro : Membros){
                        membro.usuarios();
                    }
                    menu();
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while (opcao != 0);
    }
}
