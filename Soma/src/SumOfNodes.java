package garofalo.domingues.gabriel;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodes {

    public static int SomaNos(Node root) {
        if (root == null) {
            System.out.println("Árvore está vazia");
            return -1;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        int soma = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            soma += node.data;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return soma;
    }
}