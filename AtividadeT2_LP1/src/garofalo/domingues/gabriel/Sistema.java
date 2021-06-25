package garofalo.domingues.gabriel;

import java.io.FileWriter;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;
import garofalo.domingues.gabriel.models.*;

public class Sistema {
    /**
     * Inicialização dos atributos necessários
     */
    private Scanner scanner;
    ArrayList<Membro> Membros = new ArrayList<Membro>();
    private Mobile_Members mobile;
    private Heavy_Lifters heavy;
    private Script_Guys script;
    private Big_Brothers big;

    /**
     * Inicia o sistema e exibe o menu
     */
    public Sistema() throws Exception {
        scanner = new Scanner(System.in);
        menu();
    }

    /**
     * Metódo que exibe o menu e decide o que fazer baseado no input do usuário
     */
    public void menu() throws Exception{
        /**
         * Opções Disponíveis para o usuário
         */
        System.out.println("Bem-Vindo!");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Registrar Membros");
        System.out.println("2 - Informar Horário de Trabalho");
        System.out.println("3 - Postar Mensagem");
        System.out.println("4 - Mudar Horário de Trabalho");
        System.out.println("5 - Remover Membros");
        System.out.println("6 - Listagem dos usuários");
        System.out.println("7 - Gerar arquivo com membros");
        System.out.println("0 - Sair");
        System.out.println("Opção desejada:");
        int opcao = scanner.nextInt();
        do {
            switch (opcao) {
                /**
                 * Caso o input seja 0, o sistema se encerrará com status 0
                 * Caso o input seja 1, o sistema inicializará um novo membro e cria outro case para escolher o tipo de membro e inputar seu nome e email
                 * Caso o input seja 2, o sistema pede o nome do usuário e mostra o horário de trabalho desse membro
                 * Caso o input seja 3, o sistema posta a mensagem de cada membro baseado no turno
                 * Caso o input seja 4, o sistema pergunta uma confirmação e se confirmado muda o turno
                 * Caso o input seja 5, o sistema pergunta o nome de um usuário e o remove da lista de membros
                 * Caso o input seja 6, o sistema exibe uma lista com todas as informações de todos os membros presentes
                 * Caso o input seja 7, o sistema cria um arquivo csv com a função, nome e id do membro
                 */
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
                    System.out.println("Digite seu nome de usuário: ");
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
                    System.out.println("Horário Atual : " + Membros.get(0).getHorario());
                    System.out.println("Deseja mesmo mudar o horário? (s/n)");
                    String escolha = scanner.next();
                    if (escolha.equals("s")) {
                        if (Membros.get(0).getHorario() == Turnos.Regular) {
                            for (Membro membro : Membros) {
                                membro.setHorario(Turnos.Extra);
                                if (membro.getFuncao() == TiposMembros.Mobile_Members) {membro.setMensagem(mobile.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Heavy_Lifters) {membro.setMensagem(heavy.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Script_Guys) {membro.setMensagem(script.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Big_Brothers) {membro.setMensagem(big.postaMensagem());}
                            }
                        } else {
                            for (Membro membro : Membros) {
                                membro.setHorario(Turnos.Regular);
                                if (membro.getFuncao() == TiposMembros.Mobile_Members) {membro.setMensagem(mobile.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Heavy_Lifters) {membro.setMensagem(heavy.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Script_Guys) {membro.setMensagem(script.postaMensagem());}
                                else if (membro.getFuncao() == TiposMembros.Big_Brothers) {membro.setMensagem(big.postaMensagem());}
                            }
                        }
                        System.out.println("Novo Horário : " + Membros.get(0).getHorario());
                    } else if ((escolha.equals("n"))){break;}
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
                    Membros.remove(achou);
                    System.out.println("Usuário deletado com sucesso!");
                    menu();
                case 6:
                    for (Membro membro : Membros){
                        System.out.println(membro.usuarios());
                    }
                    menu();
                case 7:
                    int id = 0;
                    FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
                    fileWriter.write("MEMBROS: \n");
                    for (Membro membro : Membros) {
                        id += 1;
                        fileWriter.append(membro.getFuncao() + " ; " + membro.getNome_usuario() + " ; " + id + "\n");
                    }
                    fileWriter.close();
                    System.out.println("Arquivo gerado com sucesso!");
                    menu();
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while (opcao != 0);
        System.out.println("Sistem Encerrado com sucesso!");
    }
}
