package garofalo.domingues.gabriel;

import java.util.Random;

public class Dado {
    private int numeroFaces;
    private int faceAtual;

    public int lancarDado(){
        Random random = new Random();
        this.faceAtual random.nextInt(this.numeroFaces);
        return this.faceAtual;
    }

    public int lerLancamentoAtual(){
        return this.faceAtual;
    }
}
