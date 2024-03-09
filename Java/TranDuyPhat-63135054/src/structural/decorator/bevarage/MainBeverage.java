package structural.decorator.bevarage;

public class MainBeverage {
    public static void main(String[] args) {
        Bevarage b = new HouseBlend("Cafe");
        b = new Milk("Sữa cô gái Hà Lan",b);
        b = new Milk("Sữa ông Thọ",b);
        System.out.println(b.getDescripton());
        System.out.println(b.cost());
        b = new Whip("Kem",b);
        System.out.println(b.getDescripton());
        System.out.println(b.cost());
    }
}
