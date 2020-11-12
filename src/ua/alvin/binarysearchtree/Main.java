package ua.alvin.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(39);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInOrder();

        System.out.println();
        System.out.println(tree.get(15));
        System.out.println(tree.get(32));
        System.out.println(tree.get(888));
        System.out.println();
        System.out.println(tree.min());
        System.out.println(tree.max());
    }
}
