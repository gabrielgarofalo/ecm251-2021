package garofalo.domingues.gabriel;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        System.out.println("Informações do Dado:");
        System.out.println("Lançamento:" + d1.lancarDado());
        System.out.println("Lançamento:" + d1.lerLancamentoAtual());
    }
}