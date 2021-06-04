package garofalo.domingues.gabriel;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo! Gostaria de testar a força da sua senha?(s/n)");
        char op = scanner.nextLine().toLowerCase().charAt(0);
        while(op != 's' && op != 'n') {
            System.out.println("Digite um caractere válido!(s/n)");
            op = scanner.nextLine().toLowerCase().charAt(0);
        }
        while(op != 'n') {
            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();
            boolean teste = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@#$&*]).{8,}", senha);
            if (teste) {
                System.out.println("A senha: " + senha + " está APROVADA");
            } else {
                System.out.println("A senha: " + senha + " está REPROVADA");
            }
            System.out.println("Gostaria de testar outra senha?(s/n)");
            op = scanner.nextLine().toLowerCase().charAt(0);
        }

    }
}
