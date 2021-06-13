package garofalo.domingues.gabriel;

public class Node_Tree {
    String item;
    Integer value;
    Node_Tree parent;
    Node_Tree firstChild;
    Node_Tree next;

    public Node_Tree(String item, Integer value) {
        this.item = item;
        this.value = value;
        this.parent = null;
        this.firstChild = null;
        this.next = null;
    }

    public Node_Tree pai() {
        if (this.parent == null)
            return null;
        else return (this.parent );
    }

    public void imprimePai() {
        if (this.parent != null)
            System.out.println("Pai: " + this.parent.item );
        else
            System.out.println("Este nó é root, não tem pai...");
    }

    public void imprimeFilhos() {
        if (this.firstChild == null)
            System.out.println("Node nao tem filhos....");
        else {
            Node_Tree trab = this.firstChild;
            while (trab != null ) {
                System.out.println(trab.item);
                trab = trab.next;
            }
        }
    }

    public boolean ehInterno() {
        if (this.firstChild != null)
            return true;
        else return false;
    }

    public int dept() {
        if (this.parent == null)
            return 0;
        else
            return ( 1 + this.parent.dept() ); }

    public int height() {
        if (this.firstChild == null )
            return 0;
        int h=0;
        Node_Tree trab = this.firstChild;
        while (trab.next != null ) {
            h = Math.max(h , trab.next.height()); trab = trab.next; }
        return 1 + h;
    }

    public void preorder() {
        System.out.println(this.item);
        Node_Tree trab = this.firstChild;
        while (trab != null ) {
            trab.preorder();
            trab = trab.next;
        }
    }

    public void posorder() {
        Node_Tree trab = this.firstChild;
        while (trab != null ) {
            trab.posorder();
            trab = trab.next;
        }
        System.out.println(this.item);
    }

    public void DobraFilhos(){
        if (this.firstChild == null)
            System.out.println("Node nao tem filhos....");
        else {
            Node_Tree trab = this.firstChild;
            while (trab != null ) {
                trab.value = trab.value * 2;
                System.out.println(trab.item);
                trab = trab.next;
            }
        }
    }

    public void DobraPai() {
        if (this.parent != null) {
            this.parent.value = this.parent.value * 2;
            System.out.println("Pai: " + this.parent.item);
        }
        else
            System.out.println("Este nó é root, não tem pai...");
    }

    public void SomaTamanho(){
        int soma = 0;
        Node_Tree trab = this.firstChild;
        soma = soma + trab.parent.value;
        while (trab != null ) {
            trab.posorder();
            soma = soma + trab.value;
            trab = trab.next;
        }
        System.out.print("Soma: " + soma);
    }
}
