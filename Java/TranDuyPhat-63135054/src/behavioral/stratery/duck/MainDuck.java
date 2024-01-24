package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new BayTrenLoThan());
        duck.setQuackBehavior(new VitQuayKeu());
        duck.display();
        System.out.println("--------------------------------------------");
        Duck duck1 = new VitSiu();
        duck1.setFlyBehavior(new VitSiuBay());
        duck1.setQuackBehavior(new VitSiuKeu());
        duck1.display();
    }
}
