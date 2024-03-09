package structural.decorator.bevarage;

public abstract class Bevarage {
    String descripton;
    public abstract int cost();

    public Bevarage(String descripton){
        this.descripton = descripton;
    }

    public String getDescripton() {
        return descripton;
    }
}
