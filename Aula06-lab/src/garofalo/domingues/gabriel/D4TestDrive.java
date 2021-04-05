package garofalo.domingues.gabriel;

public class D4TestDrive {
    D4 dado = new D4();

    for (int i = 0; i < 10; i++){
        System.out.println("Sorteio:"+dado.lancarDado());
    }
}
