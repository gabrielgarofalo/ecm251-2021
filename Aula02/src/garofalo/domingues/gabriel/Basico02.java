package garofalo.domingues.gabriel;

public class Basico02 {
    public static void main(String[] args) {
        //Estruturas  de decisão no Java
        int poderDELuta = 8000;

        //Decisão simples
        if (poderDELuta >= 8000){
            System.out.println("Kakaroto!");
        }

        //Decisão composta
        if (poderDELuta > 10000) {
            System.out.println("Pode ser super saiyan!");
        } else {
            System.out.println("Pode ser o Kuririn!");
        }

        //Decisão multipla
        int morreu = 5;
        if(morreu == 0){
            System.out.println("Você é uma pessoa normal!");
        } else if (morreu < 3){
            System.out.println("Você é umguerreiro que já foi salvo pelo Goku!");
        } else if (morreu < 8){
            System.out.println("Provavelmente você é Saiyajin!");
        } else{
            System.out.println("Bem vindo de volta Kuirin!");
        }

        //Decisão multipla - switch
        switch (morreu){
            case 0:
                System.out.println("Ola Mundo");
                break;
            case 10:
                System.out.println("Vixi!");
                break;
            default:
                System.out.println("É nois!");
                break;
        }

    }
}
