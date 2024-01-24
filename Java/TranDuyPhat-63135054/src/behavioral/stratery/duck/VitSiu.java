package behavioral.stratery.duck;

public class VitSiu extends Duck{
    @Override
    public void display() {
        System.out.println("Tôi là vịt siu");
        swim();
        performFly();
        performQuack();
    }
}
