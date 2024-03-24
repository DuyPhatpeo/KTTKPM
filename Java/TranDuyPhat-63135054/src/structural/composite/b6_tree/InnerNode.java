package structural.composite.b6_tree;

public class InnerNode extends BNode{
    BNode left;
    BNode right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {
        left = node;
    }

    @Override
    public void addR(BNode node) {
        right = node;
    }

    @Override
    public void removeL(BNode node) {
        left = null;
    }

    @Override
    public void removeR(BNode node) {
        right = null;
    }

    @Override
    String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        if(right!=null) {
            right.p = this.p + "\t";
            builder.append("\n")
                    .append(right.p)
                    .append(right.duyet());
            right.p = "";
        }
        if(left!=null) {
            left.p = this.p + "\t";
            builder.append("\n")
                    .append(left.p)
                    .append(left.duyet());
            left.p = "";
        }
        return builder.toString();
    }
}
