package garofalo.domingues.gabriel;

import static garofalo.domingues.gabriel.Node_Tree.rangeSumBST;

public class Main {

    public static void main(String[] args) {
        Tree x = new Tree();
        x.insert_root("/user/rt/cursos", 1);

        Node_Tree java = new Node_Tree("/java/", 2);
        Node_Tree ruby = new Node_Tree("/ruby/", 1);
        Node_Tree grades1 = new Node_Tree("Grades1", 8);
        Node_Tree slides = new Node_Tree("Slides/", 2);
        Node_Tree exercicios = new Node_Tree("Exercicios/", 1);
        Node_Tree grades2 = new Node_Tree("Grades2", 5);
        Node_Tree projetos = new Node_Tree("Projetos/", 1);
        Node_Tree slide01 = new Node_Tree("Slide01", 3);
        Node_Tree slide02 = new Node_Tree("Slide02", 2);
        Node_Tree slide03 = new Node_Tree("Slide03", 4);
        Node_Tree exerc01 = new Node_Tree("Exerc01", 3);
        Node_Tree exerc02 = new Node_Tree("Exerc02", 2);
        Node_Tree exerc03 = new Node_Tree("Exerc03", 4);
        Node_Tree papers = new Node_Tree("Papers/", 2);
        Node_Tree demos = new Node_Tree("Demos/", 1);
        Node_Tree thread = new Node_Tree("Thread", 9);
        Node_Tree buy = new Node_Tree("Buy", 8);
        Node_Tree market = new Node_Tree("Market", 7);

        x.root.firstChild = java;
        java.parent = x.root;
        java.next = ruby;
        ruby.parent = x.root;

        java.firstChild = grades1;
        grades1.parent = java;
        grades1.next = slides;
        slides.parent = java;
        slides.next = exercicios;
        exercicios.parent = java;

        ruby.firstChild = grades2;
        grades2.parent = ruby;
        grades2.next = projetos;
        projetos.parent = ruby;

        slides.firstChild = slide01;
        slide01.parent = slides;
        slide01.next = slide02;
        slide02.parent = slides;
        slide02.next = slide03;
        slide03.parent = slides;

        exercicios.firstChild = exerc01;
        exerc01.parent = exercicios;
        exerc01.next = exerc02;
        exerc02.parent = exercicios;
        exerc02.next = exerc03;
        exerc03.parent = exercicios;

        projetos.firstChild = papers;
        papers.parent = projetos;
        papers.next = demos;
        demos.parent = projetos;

        papers.firstChild = thread;
        thread.parent = papers;
        thread.next = buy;
        buy.parent = projetos;

        demos.firstChild = market;

        System.out.println(rangeSumBST(x.root, market.value, slide01.value));

        //x.insert_root(5);

        //Node_Tree no_0 = new Node_Tree(0);
        //Node_Tree no_1 = new Node_Tree(1);
        //Node_Tree no_2 = new Node_Tree(2);
        //Node_Tree no_3 = new Node_Tree(3);
        //Node_Tree no_4 = new Node_Tree(4);
        //Node_Tree no_6 = new Node_Tree(6);
        //Node_Tree no_7 = new Node_Tree(7);
        //Node_Tree no_8 = new Node_Tree(8);
        //Node_Tree no_12 = new Node_Tree(12);
        //Node_Tree no_21 = new Node_Tree(21);

        //x.root.firstChild = no_4;

        //no_4.parent = x.root;
        //no_4.next = no_3;

        //no_3.parent = x.root;
        //no_3.next = no_7;

        //no_7.parent = x.root;

        //no_4.firstChild = no_1;
        //no_1.parent = no_4;
        //no_1.next = no_2;
        //no_2.parent = no_4;

        //no_3.firstChild = no_8;
        //no_8.parent = no_3;

        //no_8.firstChild = no_21;
        //no_21.parent = no_8;
        //no_21.next = no_12;
        //no_12.parent = no_8;

        //no_7.firstChild = no_0;
        //no_0.parent = no_7;
        //no_0.next = no_6;
        //no_6.parent = no_7;

        //x.root.posorder();

        //x.root.imprimeFilhos();

        //no_8.imprimePai();

        //no_8.DobraFilhos();

        //no_2.DobraPai();

        //x.root.preorder();

        //no_8.SomaTamanho();

        //x.root.ImprimirFilhoFolha();
    }
}
