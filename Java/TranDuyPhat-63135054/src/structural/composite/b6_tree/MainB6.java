package structural.composite.b6_tree;

public class MainB6 {
    public static void main(String[] args) {
        BNode node1 = new InnerNode(3);
        BNode node2 = new InnerNode(4);
        BNode node3 = new InnerNode(7);
        BNode node4 = new InnerNode(5);
        BNode node5 = new Leaft(6);
        BNode node6 = new Leaft(8);
        BNode node7 = new Leaft(9);
        BNode node8 = new Leaft(9);
        node1.addR(node2);
        node1.addL(node3);
        node2.addR(node4);
        node2.addL(node5);
        node3.addR(node6);
        node3.addL(node7);
        node4.addR(node8);
        System.out.println(node1.duyet());
    }
}
