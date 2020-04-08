package binarytree;

public class TreeTester {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(8);
        tree.insert(7);
        tree.insert(6);
        tree.insert(9);
        tree.insert(10);

        System.out.println("printDepthFirst");
        tree.printDepthFirst();

        System.out.println("printBreadthFirst");
        tree.printBreadthFirst();

        System.out.println("printBreadthFirstReverseTree");
        tree.printBreadthFirstReverseTree();

        System.out.println("printDepthFirstReverseTree");
        tree.printDepthFirstReverseTree();

        //maximum depth of tree

    }
}
