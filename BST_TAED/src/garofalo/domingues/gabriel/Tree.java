package garofalo.domingues.gabriel;

public class Tree {
    Node_Tree root;
    int size;
    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public void insert_root(String valor, Integer tam) {
        Node_Tree node = new Node_Tree(valor, tam);
        this.root = node;
        this.size = 1; }

    public Node_Tree ret_Root() {
        return (this.root);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0 )
            return true;
        else return false;
    }



}
