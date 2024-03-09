package structural.decorator.bevarage;

public abstract class CondimentDecorator extends Bevarage{
    Bevarage bevarage;

    public CondimentDecorator(String descripton, Bevarage bevarage) {
        super(descripton);
        this.bevarage = bevarage;
    }

    @Override
    public String getDescripton() {
        return bevarage.getDescripton() + ", " + super.getDescripton();
    }
}
