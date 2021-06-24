package garofalo.domingues.gabriel;

import java.util.LinkedList;
import java.util.Queue;

public class Node_Tree {
    String item;
    Integer value;
    Node_Tree parent;
    Node_Tree firstChild;
    Node_Tree next;
    Node_Tree left, right;

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

    static int sum = 0;

    static int rangeSumBST(Node_Tree root, int low,
                           int high)
    {

        // Base Case
        if (root == null)
            return 0;

        // Stores the nodes while
        // performing level order traversal
        Queue<Node_Tree> q = new LinkedList<Node_Tree>();

        // Push the root node
        // into the queue
        q.add(root);

        // Iterate until queue is empty
        while (q.isEmpty() == false)
        {

            // Stores the front
            // node of the queue
            Node_Tree curr = q.peek();
            q.remove();

            // If the value of the node
            // lies in the given range
            if (curr.value >= low &&
                    curr.value <= high)
            {

                // Add it to sum
                sum += curr.value;
            }

            // If the left child is
            // not null and exceeds low
            if (curr.left != null &&
                    curr.value > low)

                // Insert into queue
                q.add(curr.left);

            // If the right child is not
            // null and exceeds low
            if (curr.right != null &&
                    curr.value < high)

                // Insert into queue
                q.add(curr.right);
        }

        // Return the resultant sum
        return sum;
    }

}
