package structural.decorator.bevarage;

public class Whip extends CondimentDecorator{
    public Whip(String descripton, Bevarage bevarage) {
        super(descripton, bevarage);
    }

    @Override
    public int cost() {
        return 3 + bevarage.cost();
    }
}
