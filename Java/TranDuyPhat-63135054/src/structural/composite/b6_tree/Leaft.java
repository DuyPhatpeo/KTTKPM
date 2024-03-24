package structural.composite.b6_tree;

public class Leaft extends BNode{
    public Leaft(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {
    }

    @Override
    public void addR(BNode node) {

    }

    @Override
    public void removeL(BNode node) {

    }

    @Override
    public void removeR(BNode node) {

    }

    @Override
    String duyet() {
        return String.valueOf(value);
    }
}
