package structural.decorator.bevarage;

public class Milk extends CondimentDecorator{
    public Milk(String descripton, Bevarage bevarage) {
        super(descripton, bevarage);
    }

    @Override
    public int cost() {
        return 2 + bevarage.cost();
    }

}
