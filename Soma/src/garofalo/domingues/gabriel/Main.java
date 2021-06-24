package garofalo.domingues.gabriel;

import garofalo.domingues.gabriel.Node;
import garofalo.domingues.gabriel.SumOfNodes;

public class Main {

    public static void main(String[] args) {
        // root level 0
        Node user = Node.createNode(1);
        // Level 1
        Node java = Node.createNode(2);
        Node ruby = Node.createNode(1);
        // Level 2
        Node grades1 = Node.createNode(8);
        Node slides = Node.createNode(10);
        Node exercicios = Node.createNode(1);
        Node grades2 = Node.createNode(5);
        Node projetos = Node.createNode(1);
        //Level 3
        Node slides1 = Node.createNode(3);
        Node slides2 = Node.createNode(6);
        Node exercicios1 = Node.createNode(3);
        Node exercicios2 = Node.createNode(6);
        Node papers = Node.createNode(2);
        Node demos = Node.createNode(1);
        //Level 4
        Node thread = Node.createNode(9);
        Node buy = Node.createNode(8);
        Node market = Node.createNode(7);

        // connect Level 0 and 1
        user.left = java;
        user.right = ruby;
        // connect level 1 and level 2
        java.left = slides;
        java.right = exercicios;
        ruby.left = grades2;
        ruby.right = projetos;

        slides.left = slides1;
        slides.right = slides2;

        exercicios.left = exercicios1;
        exercicios.right = exercicios2;

        projetos.right = demos;
        projetos.left = papers;
        papers.left = thread;
        papers.right = buy;

        demos.left = market;


        int somaJava = SumOfNodes.SomaNos(java);
        int somaRuby = SumOfNodes.SomaNos(ruby);
        int somaTotal = SumOfNodes.SomaNos(user);
        System.out.println("Soma dos nós até Java : " + somaJava);
        System.out.println("Soma dos nós até Ruby : " + somaRuby);
        System.out.println("Soma Total: " + somaTotal);
    }
}
