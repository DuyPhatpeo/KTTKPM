package creational.factory.pizza;

public abstract class Pizza {
    public StringBuilder builder = new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void box();
    public abstract void cut();

    @Override
    public String toString() {
        return builder.toString();
    }
}
