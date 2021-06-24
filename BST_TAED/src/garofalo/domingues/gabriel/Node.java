package garofalo.domingues.gabriel;

class SumOfNodes {

    //Represent the node of binary tree
    public static class Node{
        int data;
        Node left;
        Node right;
        String nome;

        public Node(String nome, int data){
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
            this.nome = nome;
        }
    }

    //Represent the root of binary tree
    public Node root;

    public SumOfNodes(){
        root = null;
    }

    //calculateSum() will calculate the sum of all the nodes present in the binary tree
    public int calculateSum(Node temp){
        int sum, sumLeft, sumRight;
        sum = sumRight = sumLeft = 0;

        //Check whether tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            //Calculate the sum of nodes present in left subtree
            if(temp.left != null)
                sumLeft = calculateSum(temp.left);

            //Calculate the sum of nodes present in right subtree
            if(temp.right != null)
                sumRight = calculateSum(temp.right);

            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data
            sum = temp.data + sumLeft + sumRight;
            return sum;
        }
    }

    public static void main(String[] args) {

        SumOfNodes bt = new SumOfNodes();
        //Add nodes to the binary tree
        bt.root = new Node("/user/rt/cursos", 1);
        bt.root.left = new Node("/java/", 2);
        bt.root.right = new Node("/ruby/", 1);
        bt.root.left.left = new Node("Grades1", 8);
        bt.root.left.left = new Node("Slides/", 2);
        bt.root.left.left = new Node("Exercicios/", 1);
        bt.root.right.right = new Node("Grades2", 5);
        bt.root.right.right = new Node("Projetos/", 1);
        bt.root.left.left.left = new Node("Slide01", 3);
        bt.root.left.left.left = new Node("Slide02", 2);
        bt.root.left.left.left = new Node("Slide03", 4);
        bt.root.left.left.left = new Node("Exerc01", 3);
        bt.root.left.left.left = new Node("Exerc02", 2);
        bt.root.left.left.left = new Node("Exerc03", 4);
        bt.root.right.right.right = new Node("Papers/", 2);
        bt.root.right.right.right = new Node("Demos/", 1);
        bt.root.right.right.right.right = new Node("Thread", 9);
        bt.root.right.right.right = new Node("Buy", 8);
        bt.root.right.right.right = new Node("Market", 7);

        //Display the sum of all the nodes in the given binary tree
        System.out.println("Sum of all nodes of binary tree: " + bt.calculateSum(bt.root));
    }
}
