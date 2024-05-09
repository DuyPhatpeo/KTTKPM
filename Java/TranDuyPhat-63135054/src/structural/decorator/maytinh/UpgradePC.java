package structural.decorator.maytinh;

public abstract class UpgradePC  extends Computer{
    Computer computer;

    public UpgradePC(Computer computer) {
        this.computer = computer;
    }
}
